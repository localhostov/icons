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

public val Icons.Bold.EngineWarning: ImageVector
    get() {
        if (_engineWarning != null) {
            return _engineWarning!!
        }
        _engineWarning = Builder(name = "EngineWarning", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 7.0f, 7.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 12.0f, 5.0f)
                close()
                moveTo(13.5f, 17.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.5f, 14.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(13.5f, 12.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.5f, 7.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(5.636f, 18.364f)
                lineTo(3.515f, 20.485f)
                arcToRelative(12.013f, 12.013f, 0.0f, false, true, 0.0f, -16.97f)
                lineTo(5.636f, 5.636f)
                arcTo(9.01f, 9.01f, 0.0f, false, false, 5.636f, 18.364f)
                close()
                moveTo(20.485f, 20.485f)
                lineTo(18.364f, 18.364f)
                arcToRelative(9.01f, 9.01f, 0.0f, false, false, 0.0f, -12.728f)
                lineToRelative(2.121f, -2.121f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 20.485f, 20.485f)
                close()
            }
        }
        .build()
        return _engineWarning!!
    }

private var _engineWarning: ImageVector? = null
