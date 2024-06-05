package me.localx.icons.straight.filled

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

public val Icons.Filled.SignalAlt: ImageVector
    get() {
        if (_signalAlt != null) {
            return _signalAlt!!
        }
        _signalAlt = Builder(name = "SignalAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 6.0f)
                lineTo(11.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 8.0f)
                lineTo(9.0f, 24.0f)
                horizontalLineToRelative(6.0f)
                lineTo(15.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.0f, 6.0f)
                close()
                moveTo(13.0f, 22.0f)
                lineTo(11.0f, 22.0f)
                lineTo(11.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 0.0f)
                lineTo(20.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(18.0f, 24.0f)
                horizontalLineToRelative(6.0f)
                lineTo(24.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 0.0f)
                close()
                moveTo(22.0f, 22.0f)
                lineTo(20.0f, 22.0f)
                lineTo(20.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 12.0f)
                horizontalLineTo(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 12.0f)
                close()
            }
        }
        .build()
        return _signalAlt!!
    }

private var _signalAlt: ImageVector? = null
