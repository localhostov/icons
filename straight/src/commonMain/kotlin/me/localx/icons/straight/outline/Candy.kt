package me.localx.icons.straight.outline

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

public val Icons.Outline.Candy: ImageVector
    get() {
        if (_candy != null) {
            return _candy!!
        }
        _candy = Builder(name = "Candy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 7.0f)
                arcToRelative(7.476f, 7.476f, 0.0f, false, false, -7.0f, -7.0f)
                lineTo(16.0f, 0.0f)
                lineTo(16.0f, 3.473f)
                arcTo(9.691f, 9.691f, 0.0f, false, false, 6.091f, 6.087f)
                arcTo(9.7f, 9.7f, 0.0f, false, false, 3.478f, 16.0f)
                lineTo(0.046f, 16.0f)
                lineToRelative(-0.04f, 0.958f)
                arcToRelative(6.58f, 6.58f, 0.0f, false, false, 1.968f, 4.719f)
                arcTo(7.215f, 7.215f, 0.0f, false, false, 7.0f, 24.0f)
                lineTo(8.0f, 24.0f)
                lineTo(8.0f, 20.526f)
                arcToRelative(9.7f, 9.7f, 0.0f, false, false, 9.913f, -2.613f)
                arcTo(9.706f, 9.706f, 0.0f, false, false, 20.53f, 8.0f)
                lineTo(24.0f, 8.0f)
                close()
                moveTo(6.0f, 21.866f)
                arcToRelative(5.64f, 5.64f, 0.0f, false, true, -2.587f, -1.573f)
                arcTo(5.1f, 5.1f, 0.0f, false, true, 2.1f, 18.0f)
                lineTo(6.0f, 18.0f)
                close()
                moveTo(16.5f, 16.5f)
                curveToRelative(-2.59f, 2.589f, -6.356f, 3.257f, -8.96f, 1.59f)
                lineToRelative(-0.992f, -0.636f)
                lineToRelative(-0.636f, -0.992f)
                curveToRelative(-1.666f, -2.6f, -1.0f, -6.371f, 1.59f, -8.96f)
                reflectiveCurveToRelative(6.356f, -3.258f, 8.959f, -1.591f)
                lineToRelative(0.992f, 0.637f)
                lineToRelative(0.636f, 0.992f)
                curveTo(19.759f, 10.142f, 19.091f, 13.909f, 16.5f, 16.5f)
                close()
                moveTo(18.0f, 6.0f)
                lineTo(18.0f, 2.131f)
                arcTo(5.83f, 5.83f, 0.0f, false, true, 21.856f, 6.0f)
                close()
                moveTo(13.671f, 13.671f)
                lineTo(15.085f, 15.085f)
                arcToRelative(6.483f, 6.483f, 0.0f, false, true, -3.543f, 1.858f)
                arcToRelative(5.007f, 5.007f, 0.0f, false, true, -0.765f, 0.06f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -2.728f, -1.05f)
                lineToRelative(1.414f, -1.414f)
                arcToRelative(2.013f, 2.013f, 0.0f, false, false, 1.775f, 0.428f)
                arcTo(4.543f, 4.543f, 0.0f, false, false, 13.674f, 13.671f)
                close()
            }
        }
        .build()
        return _candy!!
    }

private var _candy: ImageVector? = null
