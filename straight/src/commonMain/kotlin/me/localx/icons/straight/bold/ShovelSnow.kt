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

public val Icons.Bold.ShovelSnow: ImageVector
    get() {
        if (_shovelSnow != null) {
            return _shovelSnow!!
        }
        _shovelSnow = Builder(name = "ShovelSnow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.872f, 7.128f)
                lineToRelative(2.121f, -2.121f)
                lineTo(18.993f, 0.007f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(1.439f, 1.439f)
                lineToRelative(-5.704f, 5.704f)
                lineToRelative(-1.582f, -1.582f)
                curveToRelative(-1.398f, -1.399f, -3.676f, -1.399f, -5.074f, 0.0f)
                lineTo(-0.012f, 13.651f)
                lineToRelative(10.36f, 10.36f)
                lineToRelative(5.962f, -5.963f)
                curveToRelative(1.399f, -1.399f, 1.399f, -3.675f, 0.0f, -5.074f)
                lineToRelative(-1.582f, -1.582f)
                lineToRelative(5.704f, -5.704f)
                lineToRelative(1.439f, 1.439f)
                close()
                moveTo(14.189f, 15.928f)
                lineToRelative(-3.841f, 3.841f)
                lineToRelative(-1.998f, -1.998f)
                lineToRelative(2.633f, -2.633f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(-2.633f, 2.633f)
                lineToRelative(-1.998f, -1.998f)
                lineToRelative(3.841f, -3.841f)
                curveToRelative(0.229f, -0.229f, 0.603f, -0.229f, 0.832f, 0.0f)
                lineToRelative(5.285f, 5.285f)
                curveToRelative(0.229f, 0.229f, 0.229f, 0.603f, 0.0f, 0.832f)
                close()
            }
        }
        .build()
        return _shovelSnow!!
    }

private var _shovelSnow: ImageVector? = null
