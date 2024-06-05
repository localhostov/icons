package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Download: ImageVector
    get() {
        if (_download != null) {
            return _download!!
        }
        _download = Builder(name = "Download", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(210.731f, 386.603f)
                curveToRelative(24.986f, 25.002f, 65.508f, 25.015f, 90.51f, 0.029f)
                curveToRelative(0.01f, -0.01f, 0.019f, -0.019f, 0.029f, -0.029f)
                lineToRelative(68.501f, -68.501f)
                curveToRelative(7.902f, -8.739f, 7.223f, -22.23f, -1.516f, -30.132f)
                curveToRelative(-8.137f, -7.357f, -20.527f, -7.344f, -28.649f, 0.03f)
                lineToRelative(-62.421f, 62.443f)
                lineToRelative(0.149f, -329.109f)
                curveTo(277.333f, 9.551f, 267.782f, 0.0f, 256.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-11.782f, 0.0f, -21.333f, 9.551f, -21.333f, 21.333f)
                lineToRelative(-0.192f, 328.704f)
                lineTo(172.395f, 288.0f)
                curveToRelative(-8.336f, -8.33f, -21.846f, -8.325f, -30.176f, 0.011f)
                curveToRelative(-8.33f, 8.336f, -8.325f, 21.846f, 0.011f, 30.176f)
                lineTo(210.731f, 386.603f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(490.667f, 341.333f)
                lineTo(490.667f, 341.333f)
                curveToRelative(-11.782f, 0.0f, -21.333f, 9.551f, -21.333f, 21.333f)
                verticalLineTo(448.0f)
                curveToRelative(0.0f, 11.782f, -9.551f, 21.333f, -21.333f, 21.333f)
                horizontalLineTo(64.0f)
                curveToRelative(-11.782f, 0.0f, -21.333f, -9.551f, -21.333f, -21.333f)
                verticalLineToRelative(-85.333f)
                curveToRelative(0.0f, -11.782f, -9.551f, -21.333f, -21.333f, -21.333f)
                lineToRelative(0.0f, 0.0f)
                curveTo(9.551f, 341.333f, 0.0f, 350.885f, 0.0f, 362.667f)
                verticalLineTo(448.0f)
                curveToRelative(0.0f, 35.346f, 28.654f, 64.0f, 64.0f, 64.0f)
                horizontalLineToRelative(384.0f)
                curveToRelative(35.346f, 0.0f, 64.0f, -28.654f, 64.0f, -64.0f)
                verticalLineToRelative(-85.333f)
                curveTo(512.0f, 350.885f, 502.449f, 341.333f, 490.667f, 341.333f)
                close()
            }
        }
        .build()
        return _download!!
    }

private var _download: ImageVector? = null
