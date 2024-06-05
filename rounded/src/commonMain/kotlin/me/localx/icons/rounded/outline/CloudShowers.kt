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

public val Icons.Outline.CloudShowers: ImageVector
    get() {
        if (_cloudShowers != null) {
            return _cloudShowers!!
        }
        _cloudShowers = Builder(name = "CloudShowers", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(13.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 24.0f)
                close()
                moveTo(6.0f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(5.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 24.0f)
                close()
                moveTo(18.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(17.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 22.0f)
                close()
                moveTo(10.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(9.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 22.0f)
                close()
                moveTo(2.0f, 18.328f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.777f, -0.371f)
                arcTo(5.532f, 5.532f, 0.0f, false, true, 1.8f, 10.43f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.345f, -0.9f)
                arcToRelative(8.147f, 8.147f, 0.0f, false, true, -0.033f, -2.889f)
                arcTo(7.945f, 7.945f, 0.0f, false, true, 8.5f, 0.138f)
                arcToRelative(8.052f, 8.052f, 0.0f, false, true, 8.734f, 4.438f)
                arcToRelative(1.039f, 1.039f, 0.0f, false, false, 0.743f, 0.57f)
                arcTo(7.55f, 7.55f, 0.0f, false, true, 22.846f, 16.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.692f, -1.068f)
                arcToRelative(5.537f, 5.537f, 0.0f, false, false, -3.571f, -8.325f)
                arcToRelative(3.009f, 3.009f, 0.0f, false, true, -2.158f, -1.672f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 4.086f, 6.967f)
                arcToRelative(6.136f, 6.136f, 0.0f, false, false, 0.024f, 2.18f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.964f, 2.763f)
                arcTo(3.518f, 3.518f, 0.0f, false, false, 2.777f, 16.7f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 18.328f)
                close()
            }
        }
        .build()
        return _cloudShowers!!
    }

private var _cloudShowers: ImageVector? = null
