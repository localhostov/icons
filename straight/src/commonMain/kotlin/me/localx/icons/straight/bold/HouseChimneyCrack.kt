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

public val Icons.Bold.HouseChimneyCrack: ImageVector
    get() {
        if (_houseChimneyCrack != null) {
            return _houseChimneyCrack!!
        }
        _houseChimneyCrack = Builder(name = "HouseChimneyCrack", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.657f, 7.396f)
                lineToRelative(-0.657f, -0.514f)
                lineTo(22.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.533f)
                lineTo(14.157f, 0.744f)
                curveToRelative(-1.271f, -0.994f, -3.045f, -0.994f, -4.314f, 0.0f)
                lineTo(1.344f, 7.395f)
                curveToRelative(-0.854f, 0.668f, -1.344f, 1.672f, -1.344f, 2.756f)
                verticalLineToRelative(13.849f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 10.151f)
                curveToRelative(0.0f, -1.084f, -0.489f, -2.088f, -1.343f, -2.756f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineToRelative(-6.047f)
                lineToRelative(2.007f, -5.81f)
                curveToRelative(0.179f, -0.592f, -0.264f, -1.19f, -0.883f, -1.19f)
                horizontalLineToRelative(-3.904f)
                lineToRelative(1.827f, -5.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-4.848f, 7.594f)
                curveToRelative(-0.399f, 0.602f, 0.032f, 1.406f, 0.754f, 1.406f)
                horizontalLineToRelative(3.23f)
                lineToRelative(-1.152f, 3.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 10.151f)
                curveToRelative(0.0f, -0.152f, 0.071f, -0.299f, 0.192f, -0.394f)
                lineTo(11.692f, 3.106f)
                curveToRelative(0.182f, -0.142f, 0.434f, -0.142f, 0.615f, 0.0f)
                lineToRelative(8.501f, 6.652f)
                curveToRelative(0.12f, 0.094f, 0.191f, 0.241f, 0.191f, 0.393f)
                verticalLineToRelative(10.849f)
                close()
            }
        }
        .build()
        return _houseChimneyCrack!!
    }

private var _houseChimneyCrack: ImageVector? = null
