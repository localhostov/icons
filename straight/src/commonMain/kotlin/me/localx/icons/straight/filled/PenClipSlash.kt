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

public val Icons.Filled.PenClipSlash: ImageVector
    get() {
        if (_penClipSlash != null) {
            return _penClipSlash!!
        }
        _penClipSlash = Builder(name = "PenClipSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.698f, 6.54f)
                lineToRelative(-4.269f, -4.269f)
                lineToRelative(1.329f, -1.327f)
                curveToRelative(1.133f, -1.133f, 2.947f, -1.262f, 4.129f, -0.296f)
                curveToRelative(0.663f, 0.542f, 1.067f, 1.341f, 1.11f, 2.191f)
                curveToRelative(0.042f, 0.851f, -0.279f, 1.684f, -0.881f, 2.286f)
                lineToRelative(-1.417f, 1.415f)
                close()
                moveTo(14.821f, 13.408f)
                lineToRelative(9.136f, 9.136f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(0.043f, 1.457f)
                lineTo(1.457f, 0.043f)
                lineToRelative(6.108f, 6.108f)
                lineToRelative(3.339f, -3.339f)
                curveToRelative(1.169f, -1.171f, 3.072f, -1.17f, 4.243f, 0.0f)
                lineToRelative(5.136f, 5.14f)
                lineToRelative(-5.461f, 5.455f)
                close()
                moveTo(10.544f, 9.131f)
                lineToRelative(4.056f, -4.036f)
                lineToRelative(-0.867f, -0.867f)
                curveToRelative(-0.39f, -0.39f, -1.025f, -0.389f, -1.415f, 0.0f)
                lineToRelative(-3.339f, 3.339f)
                lineToRelative(1.565f, 1.565f)
                close()
                moveTo(3.157f, 16.481f)
                curveToRelative(-0.849f, 0.848f, -1.194f, 3.055f, -1.322f, 4.235f)
                lineTo(0.043f, 22.507f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.836f, -1.836f)
                curveToRelative(1.198f, -0.135f, 3.326f, -0.484f, 4.155f, -1.313f)
                lineToRelative(4.536f, -4.531f)
                lineToRelative(-4.283f, -4.283f)
                lineToRelative(-4.545f, 4.522f)
                close()
            }
        }
        .build()
        return _penClipSlash!!
    }

private var _penClipSlash: ImageVector? = null
