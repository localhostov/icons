package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.A: ImageVector
    get() {
        if (_a != null) {
            return _a!!
        }
        _a = Builder(name = "A", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.931f, 22.634f)
                lineTo(16.144f, 2.814f)
                curveToRelative(-1.288f, -3.718f, -7.0f, -3.717f, -8.288f, 0.0f)
                lineTo(0.069f, 22.634f)
                curveToRelative(-0.202f, 0.514f, 0.051f, 1.095f, 0.565f, 1.296f)
                curveToRelative(0.515f, 0.203f, 1.095f, -0.051f, 1.296f, -0.565f)
                lineToRelative(2.501f, -6.366f)
                horizontalLineToRelative(15.137f)
                lineToRelative(2.501f, 6.366f)
                curveToRelative(0.202f, 0.519f, 0.795f, 0.766f, 1.296f, 0.565f)
                curveToRelative(0.514f, -0.202f, 0.767f, -0.782f, 0.565f, -1.296f)
                close()
                moveTo(5.217f, 15.0f)
                lineTo(9.717f, 3.545f)
                curveToRelative(0.924f, -2.104f, 3.641f, -2.104f, 4.565f, 0.0f)
                lineToRelative(4.5f, 11.455f)
                horizontalLineTo(5.217f)
                close()
            }
        }
        .build()
        return _a!!
    }

private var _a: ImageVector? = null
