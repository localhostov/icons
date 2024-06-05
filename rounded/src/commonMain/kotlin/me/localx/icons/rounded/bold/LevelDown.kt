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

public val Icons.Bold.LevelDown: ImageVector
    get() {
        if (_levelDown != null) {
            return _levelDown!!
        }
        _levelDown = Builder(name = "LevelDown", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.527f, 16.883f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.122f, -0.019f)
                lineTo(13.5f, 19.719f)
                verticalLineTo(5.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 8.0f, 0.0f)
                horizontalLineTo(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineTo(8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                verticalLineTo(19.719f)
                lineTo(7.594f, 16.864f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.1f, 2.141f)
                lineToRelative(3.134f, 3.08f)
                curveToRelative(0.224f, 0.222f, 0.571f, 0.562f, 0.932f, 0.914f)
                arcToRelative(3.479f, 3.479f, 0.0f, false, false, 4.884f, 0.0f)
                curveToRelative(0.361f, -0.352f, 0.708f, -0.692f, 0.925f, -0.907f)
                lineToRelative(3.142f, -3.087f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.527f, 16.883f)
                close()
            }
        }
        .build()
        return _levelDown!!
    }

private var _levelDown: ImageVector? = null
