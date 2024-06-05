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

public val Icons.Filled.EngineWarning: ImageVector
    get() {
        if (_engineWarning != null) {
            return _engineWarning!!
        }
        _engineWarning = Builder(name = "EngineWarning", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                arcToRelative(8.009f, 8.009f, 0.0f, false, false, -8.0f, 8.0f)
                curveToRelative(0.376f, 10.588f, 15.626f, 10.585f, 16.0f, 0.0f)
                arcTo(8.009f, 8.009f, 0.0f, false, false, 12.0f, 4.0f)
                close()
                moveTo(13.0f, 17.0f)
                lineTo(11.0f, 17.0f)
                lineTo(11.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 13.0f)
                lineTo(11.0f, 13.0f)
                lineTo(11.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(21.257f, 19.637f)
                lineTo(19.714f, 18.363f)
                arcToRelative(10.052f, 10.052f, 0.0f, false, false, 0.0f, -12.726f)
                lineToRelative(1.543f, -1.274f)
                arcTo(12.068f, 12.068f, 0.0f, false, true, 21.257f, 19.637f)
                close()
                moveTo(2.744f, 19.637f)
                arcToRelative(12.065f, 12.065f, 0.0f, false, true, 0.0f, -15.274f)
                lineTo(4.286f, 5.637f)
                arcToRelative(10.052f, 10.052f, 0.0f, false, false, 0.0f, 12.726f)
                close()
            }
        }
        .build()
        return _engineWarning!!
    }

private var _engineWarning: ImageVector? = null
