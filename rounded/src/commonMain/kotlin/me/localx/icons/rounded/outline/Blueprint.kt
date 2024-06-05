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

public val Icons.Outline.Blueprint: ImageVector
    get() {
        if (_blueprint != null) {
            return _blueprint!!
        }
        _blueprint = Builder(name = "Blueprint", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 10.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                close()
                moveTo(24.0f, 9.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 2.761f, -2.239f, 5.0f, -5.0f, 5.0f)
                lineTo(3.643f, 24.0f)
                curveToRelative(-2.012f, 0.0f, -3.643f, -1.631f, -3.643f, -3.643f)
                lineTo(0.0f, 3.5f)
                curveTo(0.0f, 1.567f, 1.567f, 0.0f, 3.5f, 0.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(2.761f, 0.0f, 5.0f, 2.239f, 5.0f, 5.0f)
                close()
                moveTo(2.0f, 17.338f)
                curveToRelative(0.464f, -0.22f, 0.977f, -0.338f, 1.5f, -0.338f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                lineTo(5.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(13.838f)
                close()
                moveTo(22.0f, 9.0f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                lineTo(7.0f, 6.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(15.5f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                verticalLineToRelative(-10.0f)
                close()
            }
        }
        .build()
        return _blueprint!!
    }

private var _blueprint: ImageVector? = null
