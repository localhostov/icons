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
                moveTo(17.762f, 24.0f)
                curveTo(9.631f, 24.275f, -5.017f, 9.745f, 1.784f, 1.867f)
                lineToRelative(1.15f, -1.0f)
                arcTo(3.08f, 3.08f, 0.0f, false, true, 7.26f, 0.911f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.086f, 0.1f)
                lineToRelative(1.8f, 2.339f)
                arcTo(3.108f, 3.108f, 0.0f, false, true, 9.136f, 7.63f)
                lineTo(7.978f, 9.086f)
                arcToRelative(12.789f, 12.789f, 0.0f, false, false, 6.931f, 6.946f)
                lineToRelative(1.464f, -1.165f)
                arcToRelative(3.17f, 3.17f, 0.0f, false, true, 4.282f, -0.006f)
                lineToRelative(2.34f, 1.8f)
                arcToRelative(1.126f, 1.126f, 0.0f, false, true, 0.1f, 0.085f)
                arcToRelative(3.11f, 3.11f, 0.0f, false, true, 0.0f, 4.378f)
                lineToRelative(-0.911f, 1.05f)
                arcTo(6.154f, 6.154f, 0.0f, false, true, 17.762f, 24.0f)
                close()
                moveTo(5.071f, 2.0f)
                arcToRelative(1.094f, 1.094f, 0.0f, false, false, -0.774f, 0.32f)
                lineToRelative(-1.151f, 1.0f)
                curveTo(-2.5f, 10.108f, 14.777f, 26.423f, 20.72f, 20.808f)
                lineToRelative(0.912f, -1.051f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, 0.085f, -1.559f)
                lineTo(19.39f, 16.411f)
                arcToRelative(0.811f, 0.811f, 0.0f, false, true, -0.1f, -0.087f)
                arcToRelative(1.122f, 1.122f, 0.0f, false, false, -1.548f, 0.0f)
                arcToRelative(1.01f, 1.01f, 0.0f, false, true, -0.084f, 0.076f)
                lineTo(15.7f, 17.96f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.979f, 0.152f)
                arcTo(15.011f, 15.011f, 0.0f, false, true, 5.9f, 9.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.146f, -1.0f)
                lineTo(7.6f, 6.344f)
                arcToRelative(0.849f, 0.849f, 0.0f, false, true, 0.075f, -0.084f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, 0.0f, -1.549f)
                arcToRelative(0.866f, 0.866f, 0.0f, false, true, -0.086f, -0.1f)
                lineTo(5.806f, 2.287f)
                arcTo(1.093f, 1.093f, 0.0f, false, false, 5.071f, 2.005f)
                close()
                moveTo(17.036f, 15.618f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(22.564f, 12.576f)
                curveToRelative(4.99f, -7.345f, -3.8f, -16.126f, -11.137f, -11.137f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.144f, 1.64f)
                curveToRelative(5.474f, -3.759f, 12.11f, 2.884f, 8.353f, 8.354f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.64f, 1.143f)
                close()
                moveTo(18.706f, 10.711f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.414f)
                lineTo(17.0f, 7.59f)
                lineTo(17.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                lineTo(15.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.293f, 0.707f)
                lineToRelative(2.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 0.0f)
                close()
            }
        }
        .build()
        return _callHistory!!
    }

private var _callHistory: ImageVector? = null
