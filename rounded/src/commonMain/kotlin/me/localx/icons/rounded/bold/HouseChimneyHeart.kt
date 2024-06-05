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
                moveToRelative(16.538f, 12.494f)
                curveToRelative(0.0f, 1.879f, -2.365f, 4.163f, -3.666f, 5.225f)
                curveToRelative(-0.489f, 0.399f, -1.179f, 0.399f, -1.668f, 0.0f)
                curveToRelative(-1.301f, -1.062f, -3.666f, -3.346f, -3.666f, -5.225f)
                curveToRelative(0.0f, -1.367f, 1.007f, -2.475f, 2.25f, -2.475f)
                reflectiveCurveToRelative(2.25f, 1.108f, 2.25f, 2.475f)
                curveToRelative(0.0f, -1.367f, 1.007f, -2.475f, 2.25f, -2.475f)
                reflectiveCurveToRelative(2.25f, 1.108f, 2.25f, 2.475f)
                close()
                moveTo(24.057f, 9.905f)
                verticalLineToRelative(8.614f)
                curveToRelative(0.0f, 3.032f, -2.468f, 5.5f, -5.5f, 5.5f)
                lineTo(5.558f, 24.019f)
                curveTo(2.525f, 24.02f, 0.058f, 21.552f, 0.058f, 18.52f)
                verticalLineToRelative(-8.614f)
                curveToRelative(0.0f, -1.831f, 0.906f, -3.535f, 2.424f, -4.559f)
                lineTo(8.981f, 0.96f)
                curveToRelative(1.869f, -1.262f, 4.283f, -1.262f, 6.152f, 0.0f)
                lineToRelative(3.924f, 2.648f)
                verticalLineToRelative(-1.089f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(3.143f)
                curveToRelative(1.261f, 1.038f, 2.0f, 2.588f, 2.0f, 4.242f)
                close()
                moveTo(21.057f, 9.905f)
                curveToRelative(0.0f, -0.832f, -0.411f, -1.606f, -1.102f, -2.071f)
                lineToRelative(-6.5f, -4.388f)
                curveToRelative(-0.425f, -0.286f, -0.912f, -0.43f, -1.398f, -0.43f)
                reflectiveCurveToRelative(-0.974f, 0.144f, -1.398f, 0.43f)
                lineToRelative(-6.5f, 4.387f)
                curveToRelative(-0.69f, 0.466f, -1.102f, 1.24f, -1.102f, 2.072f)
                verticalLineToRelative(8.614f)
                curveToRelative(0.0f, 1.379f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                verticalLineToRelative(-8.614f)
                close()
            }
        }
        .build()
        return _houseChimneyHeart!!
    }

private var _houseChimneyHeart: ImageVector? = null
