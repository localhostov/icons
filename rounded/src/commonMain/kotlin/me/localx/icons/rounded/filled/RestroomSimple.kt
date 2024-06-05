package me.localx.icons.rounded.filled

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

public val Icons.Filled.RestroomSimple: ImageVector
    get() {
        if (_restroomSimple != null) {
            return _restroomSimple!!
        }
        _restroomSimple = Builder(name = "RestroomSimple", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(23.354f, 19.981f)
                curveToRelative(-0.356f, 0.408f, -0.83f, 0.691f, -1.354f, 0.856f)
                verticalLineToRelative(2.163f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-2.163f)
                curveToRelative(-0.524f, -0.165f, -0.998f, -0.447f, -1.354f, -0.856f)
                curveToRelative(-0.503f, -0.577f, -0.724f, -1.301f, -0.622f, -2.036f)
                lineToRelative(1.348f, -8.796f)
                curveToRelative(0.208f, -1.519f, 1.553f, -3.149f, 3.628f, -3.149f)
                reflectiveCurveToRelative(3.42f, 1.631f, 3.63f, 3.165f)
                lineToRelative(1.344f, 8.766f)
                reflectiveCurveToRelative(0.002f, 0.01f, 0.002f, 0.015f)
                curveToRelative(0.102f, 0.735f, -0.119f, 1.459f, -0.622f, 2.036f)
                close()
                moveTo(4.0f, 5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveTo(5.381f, 0.0f, 4.0f, 0.0f)
                reflectiveCurveTo(1.5f, 1.119f, 1.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(8.0f, 10.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.883f, -0.391f, 1.67f, -1.0f, 2.22f)
                verticalLineToRelative(5.78f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-5.78f)
                curveToRelative(-0.609f, -0.549f, -1.0f, -1.337f, -1.0f, -2.22f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                close()
                moveTo(11.0f, 0.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(22.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                lineTo(12.0f, 1.0f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _restroomSimple!!
    }

private var _restroomSimple: ImageVector? = null
