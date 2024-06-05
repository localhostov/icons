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

public val Icons.Bold.LevelUp: ImageVector
    get() {
        if (_levelUp != null) {
            return _levelUp!!
        }
        _levelUp = Builder(name = "LevelUp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.527f, 7.117f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.122f, 0.019f)
                lineTo(13.5f, 4.281f)
                verticalLineTo(18.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 8.0f, 24.0f)
                horizontalLineTo(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineTo(8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, -2.5f)
                verticalLineTo(4.281f)
                lineTo(7.594f, 7.136f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.492f, 5.0f)
                lineToRelative(3.134f, -3.08f)
                curveToRelative(0.224f, -0.222f, 0.571f, -0.562f, 0.932f, -0.914f)
                arcToRelative(3.479f, 3.479f, 0.0f, false, true, 4.884f, 0.0f)
                curveToRelative(0.361f, 0.352f, 0.708f, 0.692f, 0.925f, 0.907f)
                lineTo(18.509f, 5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.527f, 7.117f)
                close()
            }
        }
        .build()
        return _levelUp!!
    }

private var _levelUp: ImageVector? = null
