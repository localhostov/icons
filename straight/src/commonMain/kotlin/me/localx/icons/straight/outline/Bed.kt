package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Bed: ImageVector
    get() {
        if (_bed != null) {
            return _bed!!
        }
        _bed = Builder(name = "Bed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 5.9999f)
                    horizontalLineTo(11.0f)
                    curveTo(10.3111f, 6.0f, 9.6431f, 6.2372f, 9.1085f, 6.6717f)
                    curveTo(8.5738f, 7.1062f, 8.205f, 7.7115f, 8.064f, 8.3859f)
                    curveTo(7.5804f, 8.1356f, 7.0445f, 8.0034f, 6.5f, 7.9999f)
                    curveTo(5.5717f, 7.9999f, 4.6815f, 8.3686f, 4.0251f, 9.025f)
                    curveTo(3.3688f, 9.6814f, 3.0f, 10.5716f, 3.0f, 11.4999f)
                    curveTo(3.0029f, 12.0199f, 3.1229f, 12.5326f, 3.351f, 12.9999f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(1.9999f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(21.9999f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(18.9999f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(21.9999f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(8.9999f)
                    curveTo(24.0f, 8.2042f, 23.6839f, 7.4412f, 23.1213f, 6.8786f)
                    curveTo(22.5587f, 6.3159f, 21.7956f, 5.9999f, 21.0f, 5.9999f)
                    close()
                    moveTo(10.0f, 8.9999f)
                    curveTo(10.0f, 8.7347f, 10.1054f, 8.4803f, 10.2929f, 8.2928f)
                    curveTo(10.4804f, 8.1052f, 10.7348f, 7.9999f, 11.0f, 7.9999f)
                    horizontalLineTo(21.0f)
                    curveTo(21.2652f, 7.9999f, 21.5196f, 8.1052f, 21.7071f, 8.2928f)
                    curveTo(21.8946f, 8.4803f, 22.0f, 8.7347f, 22.0f, 8.9999f)
                    verticalLineTo(12.9999f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(8.9999f)
                    close()
                    moveTo(5.0f, 11.4999f)
                    curveTo(5.0f, 11.2032f, 5.088f, 10.9132f, 5.2528f, 10.6665f)
                    curveTo(5.4176f, 10.4198f, 5.6519f, 10.2276f, 5.926f, 10.1141f)
                    curveTo(6.2001f, 10.0005f, 6.5017f, 9.9708f, 6.7926f, 10.0287f)
                    curveTo(7.0836f, 10.0866f, 7.3509f, 10.2294f, 7.5607f, 10.4392f)
                    curveTo(7.7704f, 10.649f, 7.9133f, 10.9163f, 7.9712f, 11.2072f)
                    curveTo(8.0291f, 11.4982f, 7.9994f, 11.7998f, 7.8858f, 12.0739f)
                    curveTo(7.7723f, 12.348f, 7.58f, 12.5823f, 7.3334f, 12.7471f)
                    curveTo(7.0867f, 12.9119f, 6.7967f, 12.9999f, 6.5f, 12.9999f)
                    curveTo(6.1022f, 12.9999f, 5.7206f, 12.8418f, 5.4393f, 12.5605f)
                    curveTo(5.158f, 12.2792f, 5.0f, 11.8977f, 5.0f, 11.4999f)
                    close()
                    moveTo(2.0f, 16.9999f)
                    verticalLineTo(14.9999f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(16.9999f)
                    horizontalLineTo(2.0f)
                    close()
                }
            }
        }
        .build()
        return _bed!!
    }

private var _bed: ImageVector? = null
