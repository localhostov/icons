package me.localx.icons.rounded.bold

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

public val Icons.Bold.CallIncoming: ImageVector
    get() {
        if (_callIncoming != null) {
            return _callIncoming!!
        }
        _callIncoming = Builder(name = "CallIncoming", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.7f, 14.025f)
                arcToRelative(3.585f, 3.585f, 0.0f, false, false, -4.946f, 0.0f)
                lineToRelative(-0.409f, 0.4f)
                arcTo(11.6f, 11.6f, 0.0f, false, true, 9.587f, 8.647f)
                lineToRelative(0.388f, -0.394f)
                arcToRelative(3.522f, 3.522f, 0.0f, false, false, 0.039f, -4.91f)
                lineTo(7.862f, 1.025f)
                arcTo(3.583f, 3.583f, 0.0f, false, false, 2.954f, 0.984f)
                reflectiveCurveToRelative(-1.067f, 0.93f, -1.092f, 0.954f)
                curveToRelative(-7.895f, 8.269f, 11.923f, 28.1f, 20.2f, 20.2f)
                curveToRelative(0.024f, -0.025f, 0.954f, -1.091f, 0.954f, -1.091f)
                arcToRelative(3.516f, 3.516f, 0.0f, false, false, -0.081f, -4.946f)
                close()
                moveTo(20.857f, 18.967f)
                curveToRelative(-0.025f, 0.024f, -0.949f, 1.083f, -0.949f, 1.083f)
                curveTo(14.655f, 24.773f, -0.91f, 10.127f, 3.95f, 4.1f)
                curveToRelative(0.0f, 0.0f, 1.059f, -0.924f, 1.084f, -0.949f)
                arcToRelative(0.487f, 0.487f, 0.0f, false, true, 0.667f, -0.04f)
                lineTo(7.854f, 5.424f)
                arcToRelative(0.485f, 0.485f, 0.0f, false, true, -0.009f, 0.717f)
                lineTo(6.737f, 7.267f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.323f, 1.61f)
                arcTo(14.855f, 14.855f, 0.0f, false, false, 15.146f, 17.6f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.588f, -0.332f)
                lineToRelative(1.134f, -1.118f)
                curveToRelative(0.29f, -0.214f, 0.441f, -0.212f, 0.748f, 0.04f)
                lineToRelative(2.238f, 2.074f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 20.854f, 18.967f)
                close()
                moveTo(15.0f, 8.0f)
                lineTo(15.0f, 3.526f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.707f, -0.707f)
                lineToRelative(1.187f, 1.187f)
                lineTo(21.437f, 0.442f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.126f, 2.116f)
                lineTo(20.015f, 6.127f)
                lineToRelative(1.166f, 1.166f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.474f, 9.0f)
                lineTo(16.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 8.0f)
                close()
            }
        }
        .build()
        return _callIncoming!!
    }

private var _callIncoming: ImageVector? = null
