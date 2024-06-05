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

public val Icons.Bold.W: ImageVector
    get() {
        if (_w != null) {
            return _w!!
        }
        _w = Builder(name = "W", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.846f, 24.0f)
                curveToRelative(-0.111f, 0.0f, -0.223f, -0.004f, -0.336f, -0.013f)
                curveToRelative(-1.887f, -0.148f, -3.364f, -1.502f, -3.675f, -3.37f)
                lineTo(0.017f, 1.722f)
                curveTo(-0.106f, 0.902f, 0.459f, 0.139f, 1.279f, 0.017f)
                curveToRelative(0.813f, -0.129f, 1.583f, 0.442f, 1.705f, 1.262f)
                lineToRelative(2.814f, 18.871f)
                curveToRelative(0.121f, 0.725f, 0.755f, 0.832f, 0.947f, 0.847f)
                curveToRelative(0.191f, 0.02f, 0.835f, 0.009f, 1.076f, -0.713f)
                lineToRelative(2.757f, -8.271f)
                curveToRelative(0.399f, -1.342f, 2.447f, -1.342f, 2.846f, 0.0f)
                lineToRelative(2.757f, 8.271f)
                curveToRelative(0.24f, 0.722f, 0.887f, 0.732f, 1.075f, 0.713f)
                curveToRelative(0.191f, -0.015f, 0.826f, -0.122f, 0.951f, -0.871f)
                lineTo(21.017f, 1.278f)
                curveToRelative(0.121f, -0.818f, 0.88f, -1.389f, 1.705f, -1.262f)
                curveToRelative(0.819f, 0.122f, 1.384f, 0.886f, 1.262f, 1.705f)
                lineToRelative(-2.814f, 18.871f)
                curveToRelative(-0.314f, 1.893f, -1.792f, 3.246f, -3.679f, 3.395f)
                curveToRelative(-1.907f, 0.152f, -3.558f, -0.96f, -4.156f, -2.755f)
                lineToRelative(-1.334f, -4.002f)
                lineToRelative(-1.334f, 4.002f)
                curveToRelative(-0.562f, 1.688f, -2.073f, 2.768f, -3.82f, 2.768f)
                close()
            }
        }
        .build()
        return _w!!
    }

private var _w: ImageVector? = null
