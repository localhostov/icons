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

public val Icons.Filled.Rv: ImageVector
    get() {
        if (_rv != null) {
            return _rv!!
        }
        _rv = Builder(name = "Rv", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.058f, 21.0f)
                curveToRelative(-0.587f, 3.954f, 5.472f, 3.952f, 4.884f, 0.0f)
                close()
                moveTo(20.942f, 21.0f)
                curveToRelative(0.587f, 3.954f, -5.472f, 3.952f, -4.884f, 0.0f)
                close()
                moveTo(16.0f, 7.0f)
                horizontalLineToRelative(4.723f)
                lineToRelative(2.618f, 4.582f)
                curveToRelative(0.078f, 0.135f, 0.14f, 0.277f, 0.2f, 0.418f)
                lineTo(15.0f, 12.0f)
                lineTo(15.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 7.0f)
                close()
                moveTo(4.0f, 7.0f)
                lineTo(8.0f, 7.0f)
                lineTo(8.0f, 9.0f)
                lineTo(4.0f, 9.0f)
                close()
                moveTo(24.0f, 14.0f)
                curveToRelative(0.0f, 0.021f, 0.0f, 0.042f, 0.0f, 0.062f)
                lineTo(24.0f, 19.0f)
                lineTo(15.0f, 19.0f)
                lineTo(15.0f, 14.0f)
                close()
                moveTo(13.0f, 8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(4.0f, 1.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.0f)
                lineTo(0.0f, 15.414f)
                lineTo(3.586f, 19.0f)
                lineTo(13.0f, 19.0f)
                close()
                moveTo(2.0f, 11.0f)
                lineTo(2.0f, 5.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _rv!!
    }

private var _rv: ImageVector? = null
