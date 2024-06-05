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

public val Icons.Bold.Gym: ImageVector
    get() {
        if (_gym != null) {
            return _gym!!
        }
        _gym = Builder(name = "Gym", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.8f, 5.983f)
                lineToRelative(-1.333f, -1.329f)
                lineToRelative(1.094f, -1.093f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.122f, -2.122f)
                lineToRelative(-1.093f, 1.094f)
                lineToRelative(-1.329f, -1.333f)
                arcToRelative(4.11f, 4.11f, 0.0f, true, false, -5.817f, 5.817f)
                lineToRelative(1.329f, 1.329f)
                lineToRelative(-5.183f, 5.187f)
                lineToRelative(-1.329f, -1.333f)
                arcToRelative(4.11f, 4.11f, 0.0f, true, false, -5.817f, 5.817f)
                lineToRelative(1.329f, 1.329f)
                lineToRelative(-1.09f, 1.093f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, 2.122f)
                lineToRelative(1.093f, -1.094f)
                lineToRelative(1.329f, 1.333f)
                arcToRelative(4.11f, 4.11f, 0.0f, true, false, 5.817f, -5.817f)
                lineToRelative(-1.329f, -1.328f)
                lineToRelative(5.188f, -5.188f)
                lineToRelative(1.324f, 1.333f)
                arcToRelative(4.11f, 4.11f, 0.0f, true, false, 5.817f, -5.817f)
                close()
                moveTo(9.675f, 20.674f)
                arcToRelative(1.139f, 1.139f, 0.0f, false, true, -1.571f, 0.0f)
                lineToRelative(-4.779f, -4.774f)
                arcToRelative(1.111f, 1.111f, 0.0f, false, true, 1.575f, -1.575f)
                lineToRelative(4.775f, 4.775f)
                arcToRelative(1.111f, 1.111f, 0.0f, false, true, 0.0f, 1.57f)
                close()
                moveTo(20.675f, 9.674f)
                arcToRelative(1.139f, 1.139f, 0.0f, false, true, -1.571f, 0.0f)
                lineToRelative(-4.779f, -4.774f)
                arcToRelative(1.111f, 1.111f, 0.0f, false, true, 1.575f, -1.575f)
                lineToRelative(4.775f, 4.775f)
                arcToRelative(1.111f, 1.111f, 0.0f, false, true, 0.0f, 1.57f)
                close()
            }
        }
        .build()
        return _gym!!
    }

private var _gym: ImageVector? = null
