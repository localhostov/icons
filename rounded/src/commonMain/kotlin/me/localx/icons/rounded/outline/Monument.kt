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

public val Icons.Outline.Monument: ImageVector
    get() {
        if (_monument != null) {
            return _monument!!
        }
        _monument = Builder(name = "Monument", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 23.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(1.0f, 24.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                lineTo(23.0f, 22.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(2.0f, 19.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.065f)
                lineToRelative(1.494f, -12.694f)
                curveToRelative(0.131f, -1.112f, 0.639f, -2.16f, 1.43f, -2.952f)
                lineToRelative(1.183f, -1.182f)
                curveToRelative(1.511f, -1.512f, 4.146f, -1.512f, 5.656f, 0.0f)
                lineToRelative(1.183f, 1.182f)
                curveToRelative(0.792f, 0.792f, 1.299f, 1.84f, 1.43f, 2.952f)
                lineToRelative(1.494f, 12.694f)
                horizontalLineToRelative(2.065f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(3.0f, 20.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                close()
                moveTo(16.921f, 18.0f)
                lineToRelative(-1.294f, -11.0f)
                horizontalLineToRelative(-2.626f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(3.921f)
                close()
                moveTo(8.661f, 5.0f)
                horizontalLineToRelative(6.678f)
                curveToRelative(-0.144f, -0.462f, -0.398f, -0.888f, -0.742f, -1.232f)
                lineToRelative(-1.183f, -1.182f)
                curveToRelative(-0.756f, -0.756f, -2.072f, -0.756f, -2.828f, 0.0f)
                lineToRelative(-1.183f, 1.182f)
                curveToRelative(-0.344f, 0.344f, -0.598f, 0.77f, -0.742f, 1.232f)
                close()
                moveTo(7.079f, 18.0f)
                horizontalLineToRelative(3.921f)
                lineTo(11.0f, 7.0f)
                horizontalLineToRelative(-2.626f)
                lineToRelative(-1.294f, 11.0f)
                close()
            }
        }
        .build()
        return _monument!!
    }

private var _monument: ImageVector? = null
