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

public val Icons.Filled.Dizzy: ImageVector
    get() {
        if (_dizzy != null) {
            return _dizzy!!
        }
        _dizzy = Builder(name = "Dizzy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.893f, 24.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(5.018f, 10.568f)
                lineTo(6.586f, 9.0f)
                lineTo(5.018f, 7.432f)
                lineTo(6.432f, 6.018f)
                lineTo(8.0f, 7.586f)
                lineTo(9.568f, 6.018f)
                lineToRelative(1.414f, 1.414f)
                lineTo(9.414f, 9.0f)
                lineToRelative(1.568f, 1.568f)
                lineTo(9.568f, 11.982f)
                lineTo(8.0f, 10.414f)
                lineTo(6.432f, 11.982f)
                close()
                moveTo(12.0f, 20.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 20.0f)
                close()
                moveTo(18.982f, 10.568f)
                lineTo(17.568f, 11.982f)
                lineTo(16.0f, 10.414f)
                lineToRelative(-1.568f, 1.568f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(14.586f, 9.0f)
                lineTo(13.018f, 7.432f)
                lineToRelative(1.414f, -1.414f)
                lineTo(16.0f, 7.586f)
                lineToRelative(1.568f, -1.568f)
                lineToRelative(1.414f, 1.414f)
                lineTo(17.414f, 9.0f)
                close()
            }
        }
        .build()
        return _dizzy!!
    }

private var _dizzy: ImageVector? = null
