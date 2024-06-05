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

public val Icons.Filled.ShieldCheck: ImageVector
    get() {
        if (_shieldCheck != null) {
            return _shieldCheck!!
        }
        _shieldCheck = Builder(name = "ShieldCheck", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.944f, 2.642f)
                lineTo(12.0f, 0.009f)
                lineTo(4.056f, 2.642f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 2.0f, 5.49f)
                lineTo(2.0f, 12.0f)
                curveToRelative(0.0f, 7.524f, 9.2f, 11.679f, 9.594f, 11.852f)
                lineToRelative(0.354f, 0.157f)
                lineToRelative(0.368f, -0.122f)
                curveTo(12.712f, 23.755f, 22.0f, 20.577f, 22.0f, 12.0f)
                lineTo(22.0f, 5.49f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 19.944f, 2.642f)
                close()
                moveTo(12.444f, 13.989f)
                arcToRelative(1.873f, 1.873f, 0.0f, false, true, -1.335f, 0.553f)
                horizontalLineToRelative(-0.033f)
                arcToRelative(1.872f, 1.872f, 0.0f, false, true, -1.345f, -0.6f)
                lineToRelative(-2.306f, -2.4f)
                lineTo(8.868f, 10.16f)
                lineTo(11.112f, 12.5f)
                lineToRelative(5.181f, -5.181f)
                lineToRelative(1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _shieldCheck!!
    }

private var _shieldCheck: ImageVector? = null
