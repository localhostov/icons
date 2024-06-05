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

public val Icons.Bold.Coffin: ImageVector
    get() {
        if (_coffin != null) {
            return _coffin!!
        }
        _coffin = Builder(name = "Coffin", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.146f, 0.0f)
                lineTo(7.854f, 0.0f)
                curveToRelative(-1.431f, 0.0f, -2.718f, 0.871f, -3.25f, 2.2f)
                lineToRelative(-2.669f, 6.673f)
                lineToRelative(3.361f, 15.127f)
                horizontalLineToRelative(13.406f)
                lineToRelative(3.361f, -15.127f)
                lineToRelative(-2.669f, -6.673f)
                curveToRelative(-0.531f, -1.329f, -1.819f, -2.2f, -3.25f, -2.2f)
                close()
                moveTo(16.297f, 21.0f)
                lineTo(7.703f, 21.0f)
                lineToRelative(-2.639f, -11.873f)
                lineToRelative(2.451f, -6.127f)
                horizontalLineToRelative(8.969f)
                lineToRelative(2.451f, 6.127f)
                lineToRelative(-2.639f, 11.873f)
                close()
            }
        }
        .build()
        return _coffin!!
    }

private var _coffin: ImageVector? = null
