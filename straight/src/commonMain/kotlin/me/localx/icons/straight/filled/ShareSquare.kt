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

public val Icons.Filled.ShareSquare: ImageVector
    get() {
        if (_shareSquare != null) {
            return _shareSquare!!
        }
        _shareSquare = Builder(name = "ShareSquare", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.41f, 9.41f)
                lineToRelative(-6.61f, 6.61f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(5.61f, -5.61f)
                lineTo(11.0f, 9.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(8.0f, 10.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(10.0f)
                lineTo(15.44f, 1.44f)
                lineTo(16.86f, 0.03f)
                lineToRelative(6.56f, 6.56f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0.0f, 2.83f)
                close()
                moveTo(12.0f, 14.03f)
                verticalLineToRelative(5.96f)
                lineTo(6.0f, 19.99f)
                lineTo(6.0f, 10.0f)
                curveToRelative(0.0f, -1.13f, 0.39f, -2.16f, 1.03f, -3.0f)
                lineTo(3.0f, 7.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                lineTo(17.0f, 24.0f)
                verticalLineToRelative(-4.96f)
                lineToRelative(-5.0f, -5.0f)
                close()
            }
        }
        .build()
        return _shareSquare!!
    }

private var _shareSquare: ImageVector? = null
