package me.localx.icons.rounded.bold

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

public val Icons.Bold.Disk: ImageVector
    get() {
        if (_disk != null) {
            return _disk!!
        }
        _disk = Builder(name = "Disk", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(483.883f, 92.438f)
                lineToRelative(-64.32f, -64.299f)
                curveTo(401.607f, 10.062f, 377.159f, -0.072f, 351.68f, 0.0f)
                horizontalLineTo(96.0f)
                curveTo(43.005f, 0.059f, 0.059f, 43.005f, 0.0f, 96.0f)
                verticalLineToRelative(320.0f)
                curveToRelative(0.059f, 52.995f, 43.005f, 95.941f, 96.0f, 96.0f)
                horizontalLineToRelative(320.0f)
                curveToRelative(52.995f, -0.059f, 95.941f, -43.005f, 96.0f, -96.0f)
                verticalLineTo(160.32f)
                curveTo(512.073f, 134.845f, 501.948f, 110.4f, 483.883f, 92.438f)
                close()
                moveTo(448.0f, 416.0f)
                curveToRelative(0.0f, 17.673f, -14.327f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(96.0f)
                curveToRelative(-17.673f, 0.0f, -32.0f, -14.327f, -32.0f, -32.0f)
                verticalLineTo(96.0f)
                curveToRelative(0.0f, -17.673f, 14.327f, -32.0f, 32.0f, -32.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(0.0f, 47.128f, 38.205f, 85.333f, 85.333f, 85.333f)
                horizontalLineToRelative(64.0f)
                curveToRelative(46.29f, -0.092f, 84.065f, -37.072f, 85.141f, -83.349f)
                curveToRelative(4.44f, 1.55f, 8.478f, 4.071f, 11.819f, 7.381f)
                lineToRelative(64.341f, 64.341f)
                curveToRelative(6.015f, 5.986f, 9.387f, 14.128f, 9.365f, 22.613f)
                verticalLineTo(416.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 298.667f)
                moveToRelative(-85.333f, 0.0f)
                arcToRelative(85.333f, 85.333f, 0.0f, true, true, 170.666f, 0.0f)
                arcToRelative(85.333f, 85.333f, 0.0f, true, true, -170.666f, 0.0f)
            }
        }
        .build()
        return _disk!!
    }

private var _disk: ImageVector? = null
