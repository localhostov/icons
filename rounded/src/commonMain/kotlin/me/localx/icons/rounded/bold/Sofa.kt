package me.localx.icons.rounded.bold

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

public val Icons.Bold.Sofa: ImageVector
    get() {
        if (_sofa != null) {
            return _sofa!!
        }
        _sofa = Builder(name = "Sofa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 8.051f)
                verticalLineToRelative(-1.551f)
                curveToRelative(0.0f, -3.584f, -2.916f, -6.5f, -6.5f, -6.5f)
                horizontalLineToRelative(-5.0f)
                curveTo(5.916f, 0.0f, 3.0f, 2.916f, 3.0f, 6.5f)
                verticalLineToRelative(1.551f)
                curveToRelative(-1.14f, 0.232f, -2.0f, 1.242f, -2.0f, 2.449f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.557f, 0.795f, 2.93f, 2.0f, 3.738f)
                verticalLineToRelative(2.262f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-2.262f)
                curveToRelative(1.205f, -0.808f, 2.0f, -2.182f, 2.0f, -3.738f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.207f, -0.86f, -2.217f, -2.0f, -2.449f)
                close()
                moveTo(20.0f, 16.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                lineTo(5.5f, 18.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(6.0f, 6.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(6.5f)
                lineTo(6.0f, 13.0f)
                verticalLineToRelative(-6.5f)
                close()
            }
        }
        .build()
        return _sofa!!
    }

private var _sofa: ImageVector? = null
