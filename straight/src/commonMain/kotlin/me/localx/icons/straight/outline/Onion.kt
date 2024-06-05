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

public val Icons.Outline.Onion: ImageVector
    get() {
        if (_onion != null) {
            return _onion!!
        }
        _onion = Builder(name = "Onion", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.0f)
                curveToRelative(0.0f, -5.672f, -4.866f, -8.715f, -8.0f, -9.749f)
                lineTo(16.0f, 0.0f)
                lineTo(8.0f, 0.0f)
                lineTo(8.0f, 3.251f)
                curveTo(4.866f, 4.285f, 0.0f, 7.328f, 0.0f, 13.0f)
                curveToRelative(0.0f, 4.521f, 3.593f, 7.879f, 9.037f, 8.767f)
                lineToRelative(-0.814f, 0.541f)
                lineToRelative(1.1f, 1.666f)
                lineTo(11.0f, 22.864f)
                lineTo(11.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 22.868f)
                lineTo(14.7f, 24.0f)
                lineToRelative(1.11f, -1.664f)
                lineToRelative(-0.852f, -0.568f)
                curveTo(20.4f, 20.882f, 24.0f, 17.524f, 24.0f, 13.0f)
                close()
                moveTo(10.0f, 4.414f)
                lineTo(10.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(0.0f, 2.413f)
                lineToRelative(0.289f, 0.293f)
                arcTo(14.422f, 14.422f, 0.0f, false, true, 18.0f, 14.0f)
                arcToRelative(5.588f, 5.588f, 0.0f, false, true, -2.612f, 4.826f)
                arcTo(12.279f, 12.279f, 0.0f, false, false, 16.0f, 15.0f)
                curveToRelative(0.0f, -6.341f, -3.158f, -9.572f, -3.293f, -9.707f)
                lineTo(12.0f, 4.586f)
                lineToRelative(-0.707f, 0.707f)
                curveTo(11.158f, 5.428f, 8.0f, 8.659f, 8.0f, 15.0f)
                arcToRelative(12.279f, 12.279f, 0.0f, false, false, 0.612f, 3.826f)
                arcTo(5.588f, 5.588f, 0.0f, false, true, 6.0f, 14.0f)
                arcTo(14.429f, 14.429f, 0.0f, false, true, 9.707f, 4.707f)
                close()
                moveTo(10.0f, 15.0f)
                arcToRelative(13.443f, 13.443f, 0.0f, false, true, 2.0f, -7.354f)
                arcTo(13.451f, 13.451f, 0.0f, false, true, 14.0f, 15.0f)
                curveToRelative(0.0f, 2.088f, -0.761f, 5.0f, -2.0f, 5.0f)
                reflectiveCurveTo(10.0f, 17.088f, 10.0f, 15.0f)
                close()
                moveTo(2.0f, 13.0f)
                arcTo(7.7f, 7.7f, 0.0f, false, true, 6.07f, 6.353f)
                arcTo(15.62f, 15.62f, 0.0f, false, false, 4.0f, 14.0f)
                arcToRelative(7.465f, 7.465f, 0.0f, false, false, 1.364f, 4.4f)
                arcTo(6.094f, 6.094f, 0.0f, false, true, 2.0f, 13.0f)
                close()
                moveTo(18.636f, 18.4f)
                arcTo(7.465f, 7.465f, 0.0f, false, false, 20.0f, 14.0f)
                arcToRelative(15.62f, 15.62f, 0.0f, false, false, -2.07f, -7.647f)
                arcTo(7.7f, 7.7f, 0.0f, false, true, 22.0f, 13.0f)
                arcTo(6.094f, 6.094f, 0.0f, false, true, 18.636f, 18.4f)
                close()
            }
        }
        .build()
        return _onion!!
    }

private var _onion: ImageVector? = null
