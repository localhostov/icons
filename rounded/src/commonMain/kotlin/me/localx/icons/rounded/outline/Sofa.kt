package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.Sofa: ImageVector
    get() {
        if (_sofa != null) {
            return _sofa!!
        }
        _sofa = Builder(name = "Sofa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 9.184f)
                verticalLineToRelative(-1.184f)
                curveTo(22.0f, 3.589f, 18.411f, 0.0f, 14.0f, 0.0f)
                horizontalLineToRelative(-4.0f)
                curveTo(5.589f, 0.0f, 2.0f, 3.589f, 2.0f, 8.0f)
                verticalLineToRelative(1.184f)
                curveToRelative(-1.161f, 0.414f, -2.0f, 1.514f, -2.0f, 2.816f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 1.557f, 0.795f, 2.93f, 2.0f, 3.738f)
                verticalLineToRelative(1.762f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-1.051f)
                curveToRelative(0.166f, 0.019f, 0.329f, 0.051f, 0.5f, 0.051f)
                horizontalLineToRelative(15.0f)
                curveToRelative(0.171f, 0.0f, 0.334f, -0.032f, 0.5f, -0.051f)
                verticalLineToRelative(1.051f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-1.762f)
                curveToRelative(1.205f, -0.808f, 2.0f, -2.182f, 2.0f, -3.738f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -1.302f, -0.839f, -2.402f, -2.0f, -2.816f)
                close()
                moveTo(10.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, 2.691f, 6.0f, 6.0f)
                verticalLineToRelative(1.184f)
                curveToRelative(-1.161f, 0.414f, -2.0f, 1.514f, -2.0f, 2.816f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.302f, -0.839f, -2.402f, -2.0f, -2.816f)
                verticalLineToRelative(-1.184f)
                curveToRelative(0.0f, -3.309f, 2.691f, -6.0f, 6.0f, -6.0f)
                close()
                moveTo(4.0f, 19.95f)
                curveToRelative(-1.14f, -0.232f, -2.0f, -1.242f, -2.0f, -2.45f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(7.95f)
                close()
                moveTo(6.0f, 20.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(4.0f)
                lineTo(6.0f, 20.0f)
                close()
                moveTo(22.0f, 17.5f)
                curveToRelative(0.0f, 1.208f, -0.86f, 2.217f, -2.0f, 2.45f)
                verticalLineToRelative(-7.95f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(5.5f)
                close()
            }
        }
        .build()
        return _sofa!!
    }

private var _sofa: ImageVector? = null
