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

public val Icons.Bold.BottleDroplet: ImageVector
    get() {
        if (_bottleDroplet != null) {
            return _bottleDroplet!!
        }
        _bottleDroplet = Builder(name = "BottleDroplet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.329f, 7.549f)
                lineToRelative(-2.329f, -1.398f)
                verticalLineToRelative(-3.236f)
                curveToRelative(0.582f, -0.206f, 1.0f, -0.761f, 1.0f, -1.414f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                curveToRelative(0.0f, 0.653f, 0.418f, 1.208f, 1.0f, 1.414f)
                verticalLineToRelative(3.236f)
                lineToRelative(-2.329f, 1.398f)
                curveToRelative(-1.647f, 0.987f, -2.671f, 2.795f, -2.671f, 4.716f)
                verticalLineToRelative(6.235f)
                curveToRelative(0.0f, 3.032f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                verticalLineToRelative(-6.235f)
                curveToRelative(0.0f, -1.921f, -1.023f, -3.729f, -2.671f, -4.716f)
                close()
                moveTo(18.0f, 18.5f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                verticalLineToRelative(-6.235f)
                curveToRelative(0.0f, -0.873f, 0.465f, -1.694f, 1.214f, -2.144f)
                lineToRelative(3.058f, -1.835f)
                curveToRelative(0.452f, -0.271f, 0.729f, -0.76f, 0.729f, -1.286f)
                lineTo(11.001f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.526f, 0.276f, 1.015f, 0.729f, 1.286f)
                lineToRelative(3.058f, 1.835f)
                curveToRelative(0.749f, 0.449f, 1.214f, 1.271f, 1.214f, 2.144f)
                verticalLineToRelative(6.235f)
                close()
                moveTo(13.1f, 12.5f)
                curveToRelative(0.856f, 0.998f, 1.9f, 2.32f, 1.9f, 3.5f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                curveToRelative(0.0f, -1.18f, 1.044f, -2.502f, 1.9f, -3.5f)
                curveToRelative(0.58f, -0.676f, 1.621f, -0.676f, 2.201f, 0.0f)
                close()
            }
        }
        .build()
        return _bottleDroplet!!
    }

private var _bottleDroplet: ImageVector? = null
