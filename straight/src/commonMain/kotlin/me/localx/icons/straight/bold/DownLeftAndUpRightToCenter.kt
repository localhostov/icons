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

public val Icons.Bold.DownLeftAndUpRightToCenter: ImageVector
    get() {
        if (_downLeftAndUpRightToCenter != null) {
            return _downLeftAndUpRightToCenter!!
        }
        _downLeftAndUpRightToCenter = Builder(name = "DownLeftAndUpRightToCenter", defaultWidth =
                512.0.dp, defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.998f, 14.411f)
                lineToRelative(-0.334f, 7.522f)
                lineToRelative(-3.238f, -3.238f)
                lineToRelative(-5.278f, 5.278f)
                lineTo(0.026f, 21.852f)
                lineToRelative(5.278f, -5.278f)
                lineToRelative(-3.238f, -3.238f)
                lineToRelative(7.522f, -0.334f)
                curveToRelative(0.795f, -0.043f, 1.452f, 0.614f, 1.409f, 1.409f)
                close()
                moveTo(23.983f, 2.138f)
                lineTo(21.862f, 0.017f)
                lineToRelative(-5.288f, 5.288f)
                lineToRelative(-3.238f, -3.238f)
                lineToRelative(-0.334f, 7.522f)
                curveToRelative(-0.043f, 0.795f, 0.614f, 1.452f, 1.409f, 1.409f)
                lineToRelative(7.522f, -0.334f)
                lineToRelative(-3.238f, -3.238f)
                lineToRelative(5.288f, -5.288f)
                close()
            }
        }
        .build()
        return _downLeftAndUpRightToCenter!!
    }

private var _downLeftAndUpRightToCenter: ImageVector? = null
