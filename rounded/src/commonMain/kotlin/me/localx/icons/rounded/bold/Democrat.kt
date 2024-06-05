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

public val Icons.Bold.Democrat: ImageVector
    get() {
        if (_democrat != null) {
            return _democrat!!
        }
        _democrat = Builder(name = "Democrat", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.519f, 8.399f)
                lineToRelative(-2.396f, -2.218f)
                curveToRelative(-0.665f, -0.752f, -1.615f, -1.181f, -2.622f, -1.181f)
                horizontalLineToRelative(-6.5f)
                lineToRelative(-2.0f, -1.5f)
                lineTo(10.001f, 1.5f)
                curveToRelative(-0.033f, -1.972f, -2.967f, -1.971f, -3.0f, 0.0f)
                verticalLineToRelative(0.514f)
                curveToRelative(-0.332f, -0.029f, -0.674f, -0.013f, -1.0f, 0.042f)
                verticalLineToRelative(-0.556f)
                curveToRelative(-0.033f, -1.972f, -2.967f, -1.971f, -3.0f, 0.0f)
                lineToRelative(0.008f, 2.655f)
                lineToRelative(-1.941f, 2.34f)
                curveToRelative(-2.871f, 2.962f, 0.496f, 7.792f, 4.339f, 6.183f)
                lineToRelative(0.594f, 2.971f)
                verticalLineToRelative(4.352f)
                curveToRelative(0.104f, 3.957f, 5.897f, 3.954f, 6.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.104f, 3.957f, 5.897f, 3.954f, 6.0f, 0.0f)
                lineTo(22.001f, 10.914f)
                curveToRelative(0.558f, 0.195f, 1.183f, 0.054f, 1.601f, -0.396f)
                curveToRelative(0.562f, -0.608f, 0.526f, -1.557f, -0.083f, -2.12f)
                close()
                moveTo(4.766f, 9.701f)
                curveToRelative(-0.565f, 0.25f, -0.791f, 0.273f, -0.782f, 0.274f)
                curveToRelative(-0.229f, 0.0f, -0.543f, -0.042f, -0.74f, -0.239f)
                curveToRelative(-0.324f, -0.324f, -0.324f, -0.852f, 0.0f, -1.176f)
                curveToRelative(0.033f, -0.033f, 2.665f, -3.203f, 2.665f, -3.203f)
                curveToRelative(0.324f, -0.391f, 0.949f, -0.465f, 1.356f, -0.159f)
                lineToRelative(3.336f, 2.502f)
                curveToRelative(0.26f, 0.194f, 0.575f, 0.3f, 0.9f, 0.3f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.205f, 0.0f, 0.33f, 0.114f, 0.387f, 0.182f)
                curveToRelative(0.052f, 0.063f, 0.113f, 0.169f, 0.113f, 0.318f)
                verticalLineToRelative(6.5f)
                lineTo(8.93f, 15.0f)
                lineToRelative(-0.701f, -3.504f)
                curveToRelative(-0.149f, -0.748f, -0.623f, -1.377f, -1.299f, -1.728f)
                curveToRelative(-0.678f, -0.351f, -1.466f, -0.375f, -2.165f, -0.066f)
                close()
                moveTo(15.0f, 11.5f)
                curveToRelative(0.034f, -1.972f, 2.967f, -1.971f, 3.0f, 0.0f)
                curveToRelative(-0.034f, 1.972f, -2.967f, 1.971f, -3.0f, 0.0f)
                close()
                moveTo(10.0f, 11.5f)
                curveToRelative(0.034f, -1.972f, 2.967f, -1.971f, 3.0f, 0.0f)
                curveToRelative(-0.034f, 1.972f, -2.967f, 1.971f, -3.0f, 0.0f)
                close()
            }
        }
        .build()
        return _democrat!!
    }

private var _democrat: ImageVector? = null
