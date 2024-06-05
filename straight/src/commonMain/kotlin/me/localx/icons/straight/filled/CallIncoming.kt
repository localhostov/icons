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

public val Icons.Filled.CallIncoming: ImageVector
    get() {
        if (_callIncoming != null) {
            return _callIncoming!!
        }
        _callIncoming = Builder(name = "CallIncoming", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.613f, 12.848f)
                lineToRelative(6.265f, 6.265f)
                lineToRelative(-3.171f, 3.171f)
                arcTo(5.893f, 5.893f, 0.0f, false, true, 16.5f, 24.0f)
                curveTo(9.252f, 24.0f, 0.0f, 14.748f, 0.0f, 7.5f)
                arcTo(5.9f, 5.9f, 0.0f, false, true, 1.716f, 3.292f)
                lineTo(4.887f, 0.122f)
                lineToRelative(6.265f, 6.265f)
                lineTo(7.027f, 10.512f)
                arcTo(12.136f, 12.136f, 0.0f, false, false, 13.48f, 16.98f)
                close()
                moveTo(17.5f, 9.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(18.439f)
                curveToRelative(0.657f, -0.66f, 4.926f, -4.951f, 5.518f, -5.543f)
                lineTo(22.543f, 0.043f)
                curveTo(21.951f, 0.635f, 17.661f, 4.948f, 17.0f, 5.611f)
                verticalLineTo(2.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.529f)
                arcTo(2.488f, 2.488f, 0.0f, false, false, 17.5f, 9.0f)
                close()
            }
        }
        .build()
        return _callIncoming!!
    }

private var _callIncoming: ImageVector? = null
