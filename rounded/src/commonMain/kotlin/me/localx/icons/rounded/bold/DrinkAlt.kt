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

public val Icons.Bold.DrinkAlt: ImageVector
    get() {
        if (_drinkAlt != null) {
            return _drinkAlt!!
        }
        _drinkAlt = Builder(name = "DrinkAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.255f, 6.27f)
                arcTo(3.373f, 3.373f, 0.0f, false, false, 18.61f, 5.0f)
                lineTo(15.121f, 5.0f)
                lineToRelative(0.173f, -1.556f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 15.79f, 3.0f)
                lineTo(19.5f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                lineTo(15.79f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.478f, 3.113f)
                lineTo(12.1f, 5.0f)
                lineTo(5.39f, 5.0f)
                arcTo(3.389f, 3.389f, 0.0f, false, false, 2.066f, 9.053f)
                lineToRelative(1.42f, 10.326f)
                arcTo(5.284f, 5.284f, 0.0f, false, false, 8.723f, 24.0f)
                horizontalLineToRelative(6.554f)
                arcToRelative(5.28f, 5.28f, 0.0f, false, false, 5.235f, -4.6f)
                lineTo(21.933f, 9.058f)
                arcTo(3.372f, 3.372f, 0.0f, false, false, 21.255f, 6.27f)
                close()
                moveTo(18.61f, 8.0f)
                arcToRelative(0.378f, 0.378f, 0.0f, false, true, 0.38f, 0.474f)
                curveToRelative(-0.009f, 0.041f, -0.215f, 1.526f, -0.215f, 1.526f)
                horizontalLineToRelative(-4.21f)
                lineToRelative(0.222f, -2.0f)
                close()
                moveTo(5.086f, 8.146f)
                arcTo(0.377f, 0.377f, 0.0f, false, true, 5.39f, 8.0f)
                horizontalLineToRelative(6.378f)
                lineToRelative(-0.222f, 2.0f)
                lineTo(5.225f, 10.0f)
                reflectiveCurveTo(5.019f, 8.513f, 5.01f, 8.474f)
                arcTo(0.379f, 0.379f, 0.0f, false, true, 5.086f, 8.146f)
                close()
                moveTo(15.277f, 21.0f)
                lineTo(8.723f, 21.0f)
                arcToRelative(2.284f, 2.284f, 0.0f, false, true, -2.262f, -2.012f)
                lineTo(5.637f, 13.0f)
                lineTo(18.363f, 13.0f)
                lineToRelative(-0.826f, 6.006f)
                arcTo(2.28f, 2.28f, 0.0f, false, true, 15.277f, 21.0f)
                close()
                moveTo(13.824f, 16.664f)
                lineTo(13.714f, 17.664f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.983f, -0.328f)
                lineToRelative(0.111f, -1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.982f, 0.328f)
                close()
            }
        }
        .build()
        return _drinkAlt!!
    }

private var _drinkAlt: ImageVector? = null
