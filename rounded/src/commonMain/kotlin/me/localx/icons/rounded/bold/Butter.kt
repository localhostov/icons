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

public val Icons.Bold.Butter: ImageVector
    get() {
        if (_butter != null) {
            return _butter!!
        }
        _butter = Builder(name = "Butter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 17.5f)
                curveToRelative(0.0f, -0.653f, -0.418f, -1.208f, -1.0f, -1.414f)
                lineTo(23.0f, 7.5f)
                curveToRelative(0.0f, -3.032f, -2.468f, -5.5f, -5.5f, -5.5f)
                lineTo(6.5f, 2.0f)
                curveTo(3.468f, 2.0f, 1.0f, 4.468f, 1.0f, 7.5f)
                verticalLineToRelative(8.586f)
                curveToRelative(-0.582f, 0.206f, -1.0f, 0.761f, -1.0f, 1.414f)
                curveToRelative(0.0f, 0.662f, 0.43f, 1.224f, 1.026f, 1.423f)
                curveToRelative(0.209f, 1.731f, 1.688f, 3.077f, 3.474f, 3.077f)
                horizontalLineToRelative(15.0f)
                curveToRelative(1.787f, 0.0f, 3.265f, -1.346f, 3.474f, -3.077f)
                curveToRelative(0.596f, -0.199f, 1.026f, -0.761f, 1.026f, -1.423f)
                close()
                moveTo(20.0f, 7.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-2.0f)
                lineTo(18.0f, 7.5f)
                curveToRelative(0.0f, -0.9f, -0.217f, -1.749f, -0.602f, -2.5f)
                horizontalLineToRelative(0.102f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                close()
                moveTo(6.5f, 5.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(8.5f)
                lineTo(4.0f, 16.0f)
                lineTo(4.0f, 7.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _butter!!
    }

private var _butter: ImageVector? = null
