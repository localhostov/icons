package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.Interactive: ImageVector
    get() {
        if (_interactive != null) {
            return _interactive!!
        }
        _interactive = Builder(name = "Interactive", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.937f, 7.442f)
                arcToRelative(4.513f, 4.513f, 0.0f, false, true, 1.543f, 0.273f)
                lineToRelative(0.471f, 0.171f)
                arcToRelative(4.487f, 4.487f, 0.0f, true, false, -6.064f, 6.066f)
                lineToRelative(-0.17f, -0.469f)
                arcToRelative(4.505f, 4.505f, 0.0f, false, true, 4.22f, -6.041f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 10.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 16.915f, 8.964f)
                lineTo(20.0f, 10.084f)
                curveToRelative(0.0f, -0.028f, 0.0f, -0.056f, 0.0f, -0.084f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 10.0f, 20.0f)
                curveToRelative(0.029f, 0.0f, 0.056f, 0.0f, 0.085f, 0.0f)
                lineToRelative(-1.12f, -3.081f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 3.0f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.669f)
                lineTo(12.8f, 9.6f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -3.2f, 3.2f)
                lineTo(13.669f, 24.0f)
                lineTo(17.774f, 19.9f)
                lineTo(21.879f, 24.0f)
                lineTo(24.0f, 21.879f)
                lineTo(19.9f, 17.774f)
                close()
                moveTo(12.782f, 12.782f)
                lineTo(18.547f, 14.882f)
                lineTo(14.878f, 18.551f)
                close()
            }
        }
        .build()
        return _interactive!!
    }

private var _interactive: ImageVector? = null
