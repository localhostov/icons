package me.localx.icons.straight.filled

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

public val Icons.Filled.Mango: ImageVector
    get() {
        if (_mango != null) {
            return _mango!!
        }
        _mango = Builder(name = "Mango", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.596f, 6.909f)
                curveToRelative(-1.702f, 0.967f, -3.583f, 1.092f, -4.365f, 1.092f)
                curveToRelative(-0.166f, 0.0f, -2.23f, 0.0f, -2.23f, 0.0f)
                curveToRelative(0.0f, -3.029f, -0.626f, -5.777f, -1.81f, -7.948f)
                lineToRelative(-1.756f, 0.958f)
                curveToRelative(0.421f, 0.721f, 0.775f, 1.795f, 0.776f, 1.798f)
                curveToRelative(0.271f, 0.8f, 0.508f, 1.76f, 0.649f, 2.893f)
                curveToRelative(-0.796f, -1.185f, -1.632f, -2.268f, -2.565f, -3.321f)
                curveToRelative(-4.207f, 1.181f, -7.104f, 4.988f, -7.104f, 9.572f)
                curveToRelative(0.0f, 1.711f, -0.625f, 3.114f, -1.809f, 4.056f)
                curveToRelative(-1.349f, 1.074f, -1.569f, 1.327f, -1.691f, 1.511f)
                curveToRelative(-0.452f, 0.68f, -0.69f, 1.472f, -0.69f, 2.291f)
                curveToRelative(0.0f, 2.284f, 1.858f, 4.143f, 4.143f, 4.143f)
                curveToRelative(6.416f, 0.0f, 19.851f, -0.004f, 19.851f, -11.84f)
                curveToRelative(0.0f, -2.112f, -0.52f, -3.724f, -1.399f, -5.204f)
                close()
                moveTo(15.5f, 19.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(18.5f, 16.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(18.004f, 5.996f)
                reflectiveCurveToRelative(-0.158f, -2.861f, 1.51f, -4.529f)
                reflectiveCurveTo(23.992f, 0.008f, 23.992f, 0.008f)
                curveToRelative(0.0f, 0.0f, 0.209f, 2.81f, -1.459f, 4.478f)
                curveToRelative(-1.668f, 1.668f, -4.529f, 1.51f, -4.529f, 1.51f)
                close()
            }
        }
        .build()
        return _mango!!
    }

private var _mango: ImageVector? = null
