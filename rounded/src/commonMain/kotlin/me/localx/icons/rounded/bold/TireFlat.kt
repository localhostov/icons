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

public val Icons.Bold.TireFlat: ImageVector
    get() {
        if (_tireFlat != null) {
            return _tireFlat!!
        }
        _tireFlat = Builder(name = "TireFlat", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 24.0f)
                lineTo(3.5f, 24.0f)
                arcToRelative(2.505f, 2.505f, 0.0f, false, true, -1.057f, -4.759f)
                curveTo(-3.568f, 11.543f, 2.232f, -0.124f, 12.0f, 0.0f)
                curveToRelative(9.762f, -0.117f, 15.56f, 11.51f, 9.564f, 19.228f)
                arcTo(2.513f, 2.513f, 0.0f, false, true, 20.5f, 24.0f)
                close()
                moveTo(5.58f, 21.0f)
                lineTo(18.424f, 21.0f)
                arcToRelative(2.17f, 2.17f, 0.0f, false, true, -0.362f, -0.758f)
                arcToRelative(2.687f, 2.687f, 0.0f, false, true, 0.83f, -2.469f)
                arcTo(9.025f, 9.025f, 0.0f, false, false, 12.0f, 3.0f)
                curveTo(4.5f, 2.906f, 0.207f, 12.014f, 5.067f, 17.724f)
                arcToRelative(2.71f, 2.71f, 0.0f, false, true, 0.871f, 2.517f)
                arcTo(2.194f, 2.194f, 0.0f, false, true, 5.58f, 21.0f)
                close()
                moveTo(11.2f, 15.836f)
                lineTo(9.25f, 18.436f)
                arcToRelative(7.038f, 7.038f, 0.0f, false, false, 5.5f, 0.0f)
                lineToRelative(-1.95f, -2.6f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.2f, 15.836f)
                close()
                moveTo(8.842f, 13.978f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.428f, -1.528f)
                lineTo(5.063f, 11.109f)
                arcToRelative(6.958f, 6.958f, 0.0f, false, false, 1.75f, 5.575f)
                close()
                moveTo(10.5f, 8.578f)
                lineTo(10.5f, 5.166f)
                arcTo(7.016f, 7.016f, 0.0f, false, false, 6.078f, 8.284f)
                lineTo(9.129f, 9.505f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.5f, 8.576f)
                close()
                moveTo(14.871f, 9.506f)
                lineTo(17.922f, 8.287f)
                arcTo(7.014f, 7.014f, 0.0f, false, false, 13.5f, 5.166f)
                verticalLineToRelative(3.41f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.871f, 9.5f)
                close()
                moveTo(15.158f, 13.98f)
                lineTo(17.187f, 16.686f)
                arcToRelative(6.958f, 6.958f, 0.0f, false, false, 1.75f, -5.575f)
                lineTo(15.586f, 12.45f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.158f, 13.978f)
                close()
            }
        }
        .build()
        return _tireFlat!!
    }

private var _tireFlat: ImageVector? = null
