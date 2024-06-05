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

public val Icons.Bold.Laugh: ImageVector
    get() {
        if (_laugh != null) {
            return _laugh!!
        }
        _laugh = Builder(name = "Laugh", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 13.0f)
                curveToRelative(0.0f, 2.0f, -2.0f, 5.0f, -4.993f, 5.0f)
                reflectiveCurveTo(7.0f, 15.0f, 7.0f, 13.0f)
                close()
                moveTo(24.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 12.0f, 24.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 24.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, -9.0f, -9.0f)
                arcTo(9.011f, 9.011f, 0.0f, false, true, 21.0f, 12.0f)
                close()
                moveTo(6.0f, 9.667f)
                lineTo(6.0f, 11.0f)
                horizontalLineToRelative(5.0f)
                lineTo(11.0f, 9.667f)
                arcTo(2.587f, 2.587f, 0.0f, false, false, 8.5f, 7.0f)
                arcTo(2.587f, 2.587f, 0.0f, false, false, 6.0f, 9.667f)
                close()
                moveTo(13.0f, 9.667f)
                lineTo(13.0f, 11.0f)
                horizontalLineToRelative(5.0f)
                lineTo(18.0f, 9.667f)
                arcTo(2.587f, 2.587f, 0.0f, false, false, 15.5f, 7.0f)
                arcTo(2.587f, 2.587f, 0.0f, false, false, 13.0f, 9.667f)
                close()
            }
        }
        .build()
        return _laugh!!
    }

private var _laugh: ImageVector? = null
