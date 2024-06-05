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

public val Icons.Bold.CloudsMoon: ImageVector
    get() {
        if (_cloudsMoon != null) {
            return _cloudsMoon!!
        }
        _cloudsMoon = Builder(name = "CloudsMoon", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.63f, 13.573f)
                arcTo(5.487f, 5.487f, 0.0f, false, false, 7.006f, 15.255f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 8.5f, 24.0f)
                horizontalLineToRelative(8.25f)
                arcToRelative(5.251f, 5.251f, 0.0f, false, false, 0.88f, -10.427f)
                close()
                moveTo(16.75f, 21.0f)
                horizontalLineTo(8.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.5f)
                arcToRelative(2.488f, 2.488f, 0.0f, false, true, 4.958f, -0.312f)
                lineToRelative(0.166f, 1.312f)
                horizontalLineTo(16.75f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 0.0f, 4.5f)
                close()
                moveTo(24.0f, 8.863f)
                lineToRelative(-0.4f, 0.865f)
                arcToRelative(6.838f, 6.838f, 0.0f, false, true, -2.7f, 3.024f)
                curveToRelative(-0.018f, 0.01f, -0.038f, 0.016f, -0.056f, 0.027f)
                arcToRelative(7.2f, 7.2f, 0.0f, false, false, -1.808f, -0.911f)
                arcToRelative(7.54f, 7.54f, 0.0f, false, false, -4.258f, -3.49f)
                lineToRelative(-0.484f, -0.6f)
                arcToRelative(7.474f, 7.474f, 0.0f, false, false, -3.592f, -2.436f)
                curveToRelative(0.028f, -0.146f, 0.049f, -0.277f, 0.086f, -0.44f)
                arcTo(6.819f, 6.819f, 0.0f, false, true, 13.84f, 0.965f)
                arcTo(6.147f, 6.147f, 0.0f, false, true, 17.159f, 0.0f)
                horizontalLineToRelative(1.39f)
                arcTo(5.495f, 5.495f, 0.0f, false, false, 24.0f, 8.863f)
                close()
                moveTo(2.0f, 19.294f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 0.079f, 0.963f)
                arcTo(4.459f, 4.459f, 0.0f, false, true, 0.0f, 16.5f)
                arcToRelative(4.508f, 4.508f, 0.0f, false, true, 3.006f, -4.245f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 8.5f, 7.0f)
                arcToRelative(5.409f, 5.409f, 0.0f, false, true, 2.943f, 0.874f)
                arcToRelative(7.476f, 7.476f, 0.0f, false, false, -6.277f, 5.841f)
                arcTo(6.513f, 6.513f, 0.0f, false, false, 2.0f, 19.294f)
                close()
            }
        }
        .build()
        return _cloudsMoon!!
    }

private var _cloudsMoon: ImageVector? = null
