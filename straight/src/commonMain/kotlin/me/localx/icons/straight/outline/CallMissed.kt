package me.localx.icons.straight.outline

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

public val Icons.Outline.CallMissed: ImageVector
    get() {
        if (_callMissed != null) {
            return _callMissed!!
        }
        _callMissed = Builder(name = "CallMissed", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.407f, 16.462f)
                curveTo(20.187f, 14.241f, 16.359f, 13.013f, 12.0f, 13.0f)
                curveToRelative(-4.365f, 0.021f, -8.254f, 1.314f, -10.4f, 3.462f)
                arcTo(5.327f, 5.327f, 0.0f, false, false, 0.0f, 20.25f)
                verticalLineTo(24.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(19.744f)
                arcTo(10.941f, 10.941f, 0.0f, false, true, 11.94f, 19.0f)
                horizontalLineTo(12.0f)
                arcTo(11.652f, 11.652f, 0.0f, false, true, 16.0f, 19.755f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(20.251f)
                arcTo(5.328f, 5.328f, 0.0f, false, false, 22.407f, 16.462f)
                close()
                moveTo(22.0f, 22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.417f)
                lineToRelative(-0.607f, -0.26f)
                arcTo(13.865f, 13.865f, 0.0f, false, false, 12.005f, 17.0f)
                arcToRelative(13.075f, 13.075f, 0.0f, false, false, -5.413f, 1.164f)
                lineTo(6.0f, 18.429f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.249f)
                arcToRelative(3.339f, 3.339f, 0.0f, false, true, 1.007f, -2.373f)
                curveToRelative(1.758f, -1.757f, 5.205f, -2.858f, 9.0f, -2.876f)
                reflectiveCurveToRelative(7.17f, 1.057f, 8.988f, 2.876f)
                arcTo(3.339f, 3.339f, 0.0f, false, true, 22.0f, 20.25f)
                close()
                moveTo(5.0f, 8.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.471f)
                arcTo(2.488f, 2.488f, 0.0f, false, true, 5.5f, 1.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(6.439f)
                lineToRelative(5.906f, 5.926f)
                arcToRelative(0.22f, 0.22f, 0.0f, false, false, 0.157f, 0.065f)
                horizontalLineToRelative(0.0f)
                arcToRelative(0.218f, 0.218f, 0.0f, false, false, 0.156f, -0.064f)
                lineToRelative(6.884f, -6.884f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-6.884f, 6.884f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -1.57f, 0.65f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.206f, 2.206f, 0.0f, false, true, -1.572f, -0.653f)
                lineTo(5.0f, 4.389f)
                close()
            }
        }
        .build()
        return _callMissed!!
    }

private var _callMissed: ImageVector? = null
