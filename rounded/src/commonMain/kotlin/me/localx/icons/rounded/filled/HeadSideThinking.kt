package me.localx.icons.rounded.filled

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

public val Icons.Filled.HeadSideThinking: ImageVector
    get() {
        if (_headSideThinking != null) {
            return _headSideThinking!!
        }
        _headSideThinking = Builder(name = "HeadSideThinking", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 11.0f)
                close()
                moveTo(24.0f, 13.0f)
                arcToRelative(1.959f, 1.959f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-0.33f)
                lineToRelative(-0.219f, 1.655f)
                arcTo(5.014f, 5.014f, 0.0f, false, true, 16.494f, 21.0f)
                lineTo(16.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                lineTo(6.0f, 24.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineToRelative(-0.971f)
                arcToRelative(3.886f, 3.886f, 0.0f, false, false, -0.74f, -2.355f)
                arcTo(10.993f, 10.993f, 0.0f, true, true, 19.8f, 4.419f)
                curveTo(21.068f, 5.985f, 24.0f, 11.58f, 24.0f, 13.0f)
                close()
                moveTo(14.841f, 9.947f)
                lineToRelative(0.993f, -0.571f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.0f, -1.734f)
                lineToRelative(-0.982f, 0.564f)
                arcTo(3.994f, 3.994f, 0.0f, false, false, 12.0f, 7.142f)
                lineTo(12.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                lineTo(10.0f, 7.142f)
                arcTo(3.994f, 3.994f, 0.0f, false, false, 8.145f, 8.206f)
                lineToRelative(-0.982f, -0.564f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.0f, 1.734f)
                lineToRelative(0.993f, 0.571f)
                arcTo(3.938f, 3.938f, 0.0f, false, false, 7.0f, 11.0f)
                arcToRelative(3.938f, 3.938f, 0.0f, false, false, 0.159f, 1.053f)
                lineToRelative(-0.993f, 0.571f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.734f)
                lineToRelative(0.982f, -0.564f)
                arcTo(3.994f, 3.994f, 0.0f, false, false, 10.0f, 14.858f)
                lineTo(10.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(12.0f, 14.858f)
                arcToRelative(3.994f, 3.994f, 0.0f, false, false, 1.855f, -1.064f)
                lineToRelative(0.982f, 0.564f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, -1.734f)
                lineToRelative(-0.993f, -0.571f)
                arcTo(3.938f, 3.938f, 0.0f, false, false, 15.0f, 11.0f)
                arcTo(3.938f, 3.938f, 0.0f, false, false, 14.841f, 9.947f)
                close()
            }
        }
        .build()
        return _headSideThinking!!
    }

private var _headSideThinking: ImageVector? = null
