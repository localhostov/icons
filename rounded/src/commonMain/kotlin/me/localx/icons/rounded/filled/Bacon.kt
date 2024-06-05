package me.localx.icons.rounded.filled

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

public val Icons.Filled.Bacon: ImageVector
    get() {
        if (_bacon != null) {
            return _bacon!!
        }
        _bacon = Builder(name = "Bacon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.735f, 21.062f)
                curveToRelative(-1.215f, -1.3f, -3.379f, -2.71f, -2.584f, -4.8f)
                arcToRelative(2.58f, 2.58f, 0.0f, false, true, 2.108f, -1.784f)
                arcToRelative(2.536f, 2.536f, 0.0f, false, false, 1.509f, -0.726f)
                arcToRelative(2.506f, 2.506f, 0.0f, false, false, 0.721f, -1.465f)
                arcToRelative(3.284f, 3.284f, 0.0f, false, true, 2.805f, -2.8f)
                arcTo(2.541f, 2.541f, 0.0f, false, false, 9.48f, 7.3f)
                arcToRelative(3.284f, 3.284f, 0.0f, false, true, 2.806f, -2.805f)
                arcToRelative(2.532f, 2.532f, 0.0f, false, false, 2.185f, -2.185f)
                arcTo(2.764f, 2.764f, 0.0f, false, true, 19.15f, 0.823f)
                horizontalLineToRelative(0.0f)
                lineToRelative(1.915f, 1.914f)
                arcToRelative(3.477f, 3.477f, 0.0f, false, false, -3.255f, 2.907f)
                arcTo(2.529f, 2.529f, 0.0f, false, true, 15.626f, 7.83f)
                arcToRelative(3.286f, 3.286f, 0.0f, false, false, -2.806f, 2.805f)
                arcToRelative(2.531f, 2.531f, 0.0f, false, true, -2.186f, 2.185f)
                arcToRelative(3.285f, 3.285f, 0.0f, false, false, -2.805f, 2.805f)
                arcTo(2.534f, 2.534f, 0.0f, false, true, 5.643f, 17.81f)
                arcTo(3.474f, 3.474f, 0.0f, false, false, 2.735f, 21.062f)
                close()
                moveTo(23.084f, 4.756f)
                lineToRelative(-0.521f, -0.521f)
                arcToRelative(4.456f, 4.456f, 0.0f, false, true, -1.692f, 0.587f)
                arcTo(1.277f, 1.277f, 0.0f, false, false, 19.8f, 5.9f)
                arcToRelative(4.534f, 4.534f, 0.0f, false, true, -3.916f, 3.913f)
                arcTo(1.277f, 1.277f, 0.0f, false, false, 14.8f, 10.888f)
                arcTo(4.531f, 4.531f, 0.0f, false, true, 10.888f, 14.8f)
                arcToRelative(1.278f, 1.278f, 0.0f, false, false, -1.077f, 1.077f)
                arcTo(4.527f, 4.527f, 0.0f, false, true, 5.9f, 19.792f)
                arcTo(1.278f, 1.278f, 0.0f, false, false, 4.82f, 20.868f)
                arcToRelative(4.49f, 4.49f, 0.0f, false, true, -0.587f, 1.692f)
                arcToRelative(3.335f, 3.335f, 0.0f, false, false, 4.775f, 0.73f)
                arcToRelative(5.176f, 5.176f, 0.0f, false, true, 0.709f, -0.334f)
                arcToRelative(4.474f, 4.474f, 0.0f, false, false, 3.409f, -3.764f)
                arcTo(1.278f, 1.278f, 0.0f, false, true, 14.2f, 18.116f)
                arcTo(4.529f, 4.529f, 0.0f, false, false, 18.118f, 14.2f)
                arcTo(1.278f, 1.278f, 0.0f, false, true, 19.2f, 13.126f)
                arcTo(4.575f, 4.575f, 0.0f, false, false, 23.04f, 9.487f)
                arcToRelative(2.867f, 2.867f, 0.0f, false, true, 0.251f, -0.5f)
                arcTo(3.169f, 3.169f, 0.0f, false, false, 23.084f, 4.756f)
                close()
            }
        }
        .build()
        return _bacon!!
    }

private var _bacon: ImageVector? = null
