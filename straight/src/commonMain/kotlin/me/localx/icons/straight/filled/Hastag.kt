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

public val Icons.Filled.Hastag: ImageVector
    get() {
        if (_hastag != null) {
            return _hastag!!
        }
        _hastag = Builder(name = "Hastag", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.765f, 9.0f)
                lineTo(24.0f, 7.0f)
                lineTo(18.054f, 7.0f)
                lineTo(18.9f, 0.0f)
                lineTo(16.883f, 0.0f)
                lineToRelative(-0.841f, 7.0f)
                lineTo(9.159f, 7.0f)
                lineTo(10.0f, 0.0f)
                lineTo(7.988f, 0.0f)
                lineTo(7.147f, 7.0f)
                lineTo(0.941f, 7.0f)
                lineTo(0.706f, 9.0f)
                horizontalLineToRelative(6.2f)
                lineToRelative(-0.721f, 6.0f)
                lineTo(0.235f, 15.0f)
                lineTo(0.0f, 17.0f)
                lineTo(5.946f, 17.0f)
                lineToRelative(-0.841f, 7.0f)
                lineTo(7.117f, 24.0f)
                lineToRelative(0.841f, -7.0f)
                horizontalLineToRelative(6.883f)
                lineTo(14.0f, 24.0f)
                horizontalLineToRelative(2.012f)
                lineToRelative(0.841f, -7.0f)
                horizontalLineToRelative(6.206f)
                lineToRelative(0.235f, -2.0f)
                horizontalLineToRelative(-6.2f)
                lineToRelative(0.721f, -6.0f)
                close()
                moveTo(15.081f, 15.0f)
                lineTo(8.2f, 15.0f)
                lineToRelative(0.721f, -6.0f)
                lineTo(15.8f, 9.0f)
                close()
            }
        }
        .build()
        return _hastag!!
    }

private var _hastag: ImageVector? = null
