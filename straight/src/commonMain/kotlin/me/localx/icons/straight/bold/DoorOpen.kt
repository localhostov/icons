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

public val Icons.Bold.DoorOpen: ImageVector
    get() {
        if (_doorOpen != null) {
            return _doorOpen!!
        }
        _doorOpen = Builder(name = "DoorOpen", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 21.0f)
                lineTo(21.0f, 5.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-1.837f)
                curveToRelative(-0.218f, -0.46f, -0.538f, -0.873f, -0.944f, -1.206f)
                curveToRelative(-0.813f, -0.667f, -1.871f, -0.933f, -2.906f, -0.726f)
                lineTo(5.813f, 1.269f)
                curveToRelative(-1.63f, 0.327f, -2.813f, 1.771f, -2.813f, 3.432f)
                lineTo(3.0f, 21.0f)
                lineTo(0.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(24.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(18.0f, 5.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(-2.0f)
                lineTo(16.0f, 5.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                close()
                moveTo(6.0f, 4.7f)
                curveToRelative(0.0f, -0.237f, 0.169f, -0.443f, 0.402f, -0.49f)
                lineToRelative(6.0f, -1.2f)
                curveToRelative(0.2f, -0.037f, 0.347f, 0.048f, 0.415f, 0.104f)
                curveToRelative(0.068f, 0.056f, 0.183f, 0.181f, 0.183f, 0.387f)
                lineTo(13.0f, 21.0f)
                lineTo(6.0f, 21.0f)
                lineTo(6.0f, 4.7f)
                close()
                moveTo(12.0f, 12.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _doorOpen!!
    }

private var _doorOpen: ImageVector? = null
