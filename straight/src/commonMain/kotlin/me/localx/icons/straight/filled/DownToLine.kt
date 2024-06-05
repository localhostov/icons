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

public val Icons.Filled.DownToLine: ImageVector
    get() {
        if (_downToLine != null) {
            return _downToLine!!
        }
        _downToLine = Builder(name = "DownToLine", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                lineTo(24.0f, 22.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(14.14f, 19.11f)
                lineToRelative(9.82f, -10.11f)
                horizontalLineToRelative(-6.95f)
                lineTo(17.01f, 0.0f)
                lineTo(7.0f, 0.0f)
                lineTo(7.0f, 9.0f)
                lineTo(0.07f, 9.0f)
                lineToRelative(9.8f, 10.11f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.57f, 0.58f, 1.32f, 0.89f, 2.12f, 0.89f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.8f, 0.0f, 1.56f, -0.31f, 2.13f, -0.89f)
                close()
            }
        }
        .build()
        return _downToLine!!
    }

private var _downToLine: ImageVector? = null
