package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.HouseChimneyHeart: ImageVector
    get() {
        if (_houseChimneyHeart != null) {
            return _houseChimneyHeart!!
        }
        _houseChimneyHeart = Builder(name = "HouseChimneyHeart", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.657f, 7.407f)
                lineToRelative(-0.657f, -0.514f)
                lineTo(22.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.546f)
                lineTo(14.156f, 0.756f)
                curveToRelative(-1.27f, -0.992f, -3.043f, -0.992f, -4.313f, 0.0f)
                lineTo(1.343f, 7.407f)
                curveToRelative(-0.854f, 0.668f, -1.343f, 1.673f, -1.343f, 2.757f)
                verticalLineToRelative(13.823f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-13.823f)
                curveToRelative(0.0f, -1.084f, -0.489f, -2.089f, -1.343f, -2.757f)
                close()
                moveTo(21.0f, 20.987f)
                lineTo(3.0f, 20.987f)
                verticalLineToRelative(-10.823f)
                curveToRelative(0.0f, -0.155f, 0.07f, -0.299f, 0.192f, -0.394f)
                lineTo(11.692f, 3.119f)
                curveToRelative(0.182f, -0.143f, 0.435f, -0.143f, 0.616f, 0.0f)
                lineToRelative(8.5f, 6.651f)
                curveToRelative(0.121f, 0.095f, 0.191f, 0.238f, 0.191f, 0.394f)
                verticalLineToRelative(10.823f)
                close()
                moveTo(17.0f, 12.7f)
                curveToRelative(0.0f, 2.828f, -5.0f, 6.3f, -5.0f, 6.3f)
                curveToRelative(0.0f, 0.0f, -5.0f, -3.472f, -5.0f, -6.3f)
                curveToRelative(0.0f, -1.491f, 1.119f, -2.7f, 2.5f, -2.7f)
                reflectiveCurveToRelative(2.5f, 0.963f, 2.5f, 2.455f)
                curveToRelative(0.0f, -1.491f, 1.119f, -2.455f, 2.5f, -2.455f)
                reflectiveCurveToRelative(2.5f, 1.209f, 2.5f, 2.7f)
                close()
            }
        }
        .build()
        return _houseChimneyHeart!!
    }

private var _houseChimneyHeart: ImageVector? = null
