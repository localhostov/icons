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

public val Icons.Outline.TruckCouch: ImageVector
    get() {
        if (_truckCouch != null) {
            return _truckCouch!!
        }
        _truckCouch = Builder(name = "TruckCouch", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineTo(16.271f)
                lineTo(3.336f, 20.991f)
                lineToRelative(-1.285f, -3.9f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.636f, -1.263f)
                lineToRelative(0.96f, -0.316f)
                lineToRelative(0.927f, 2.865f)
                lineTo(16.1f, 14.436f)
                lineToRelative(-0.921f, -2.844f)
                lineToRelative(0.821f, -0.27f)
                verticalLineTo(9.269f)
                arcToRelative(3.013f, 3.013f, 0.0f, false, false, -0.507f, 0.114f)
                lineToRelative(-0.93f, 0.306f)
                lineToRelative(-0.85f, -2.628f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.806f, -1.9f)
                lineTo(4.09f, 7.194f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -1.911f, 3.783f)
                lineToRelative(0.852f, 2.633f)
                lineToRelative(-0.97f, 0.32f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.15f, 17.718f)
                lineToRelative(1.282f, 3.887f)
                lineToRelative(-1.379f, 0.443f)
                lineToRelative(0.613f, 1.9f)
                lineToRelative(15.468f, -4.979f)
                arcTo(4.018f, 4.018f, 0.0f, false, false, 20.0f, 24.0f)
                curveToRelative(5.274f, -0.138f, 5.274f, -7.863f, 0.0f, -8.0f)
                verticalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 2.0f)
                close()
                moveTo(4.137f, 9.593f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, true, 0.6f, -0.506f)
                lineTo(10.551f, 7.05f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.261f, 0.632f)
                lineToRelative(1.78f, 5.5f)
                lineToRelative(-7.74f, 2.647f)
                lineTo(4.08f, 10.356f)
                arcTo(0.993f, 0.993f, 0.0f, false, true, 4.137f, 9.593f)
                close()
                moveTo(22.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 20.0f)
                close()
            }
        }
        .build()
        return _truckCouch!!
    }

private var _truckCouch: ImageVector? = null
