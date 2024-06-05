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

public val Icons.Outline.CallHistory: ImageVector
    get() {
        if (_callHistory != null) {
            return _callHistory!!
        }
        _callHistory = Builder(name = "CallHistory", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 24.0f)
                curveTo(9.252f, 24.0f, 0.0f, 14.748f, 0.0f, 7.5f)
                arcTo(5.887f, 5.887f, 0.0f, false, true, 1.717f, 3.292f)
                lineTo(4.887f, 0.122f)
                lineToRelative(6.264f, 6.265f)
                lineTo(7.745f, 9.793f)
                arcTo(12.145f, 12.145f, 0.0f, false, false, 14.2f, 16.262f)
                lineToRelative(3.414f, -3.414f)
                lineToRelative(6.266f, 6.265f)
                lineToRelative(-3.172f, 3.172f)
                arcTo(5.888f, 5.888f, 0.0f, false, true, 16.5f, 24.0f)
                close()
                moveTo(4.887f, 2.951f)
                lineTo(3.13f, 4.708f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 2.0f, 7.5f)
                curveTo(2.0f, 13.734f, 10.266f, 22.0f, 16.5f, 22.0f)
                arcToRelative(3.908f, 3.908f, 0.0f, false, false, 2.792f, -1.128f)
                lineToRelative(1.759f, -1.759f)
                lineToRelative(-3.438f, -3.437f)
                lineTo(14.686f, 18.6f)
                lineToRelative(-0.606f, -0.232f)
                arcTo(14.368f, 14.368f, 0.0f, false, true, 5.634f, 9.936f)
                lineToRelative(-0.246f, -0.613f)
                lineTo(8.323f, 6.387f)
                close()
                moveTo(17.187f, 10.689f)
                lineTo(18.56f, 9.318f)
                lineTo(17.0f, 7.758f)
                lineTo(17.0f, 5.0f)
                lineTo(15.0f, 5.0f)
                lineTo(15.0f, 8.5f)
                close()
                moveTo(11.565f, 3.973f)
                arcToRelative(5.991f, 5.991f, 0.0f, true, true, 8.463f, 8.461f)
                lineToRelative(1.413f, 1.414f)
                arcTo(7.988f, 7.988f, 0.0f, true, false, 10.152f, 2.559f)
                close()
            }
        }
        .build()
        return _callHistory!!
    }

private var _callHistory: ImageVector? = null
