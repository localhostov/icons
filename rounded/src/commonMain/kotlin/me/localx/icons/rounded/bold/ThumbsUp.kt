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

public val Icons.Bold.ThumbsUp: ImageVector
    get() {
        if (_thumbsUp != null) {
            return _thumbsUp!!
        }
        _thumbsUp = Builder(name = "ThumbsUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.7521f, 8.0092f)
                curveTo(21.714f, 6.7227f, 20.1484f, 5.9764f, 18.4952f, 5.9799f)
                horizontalLineTo(16.4648f)
                lineTo(16.5545f, 5.4538f)
                curveTo(16.92f, 3.3109f, 15.4792f, 1.2774f, 13.3363f, 0.9119f)
                curveTo(13.1005f, 0.8717f, 12.8615f, 0.853f, 12.6224f, 0.8562f)
                curveTo(11.1197f, 0.8484f, 9.7412f, 1.6887f, 9.0598f, 3.028f)
                lineTo(7.5535f, 5.9799f)
                horizontalLineTo(5.4793f)
                curveTo(2.4546f, 5.9832f, 0.0033f, 8.4344f, 0.0f, 11.4592f)
                verticalLineTo(16.4404f)
                curveTo(0.0033f, 19.4652f, 2.4546f, 21.9165f, 5.4793f, 21.9197f)
                horizontalLineTo(17.4422f)
                curveTo(20.0277f, 21.9104f, 22.2583f, 20.1027f, 22.803f, 17.5751f)
                lineTo(23.856f, 12.5939f)
                curveTo(24.2015f, 10.9774f, 23.7956f, 9.2913f, 22.7521f, 8.0092f)
                close()
                moveTo(2.9887f, 16.4404f)
                verticalLineTo(11.4592f)
                curveTo(2.9887f, 10.0837f, 4.1038f, 8.9686f, 5.4793f, 8.9686f)
                horizontalLineTo(6.9737f)
                verticalLineTo(18.931f)
                horizontalLineTo(5.4793f)
                curveTo(4.1038f, 18.931f, 2.9887f, 17.8159f, 2.9887f, 16.4404f)
                close()
                moveTo(20.932f, 11.9753f)
                lineTo(19.878f, 16.9565f)
                curveTo(19.6308f, 18.1052f, 18.6172f, 18.9269f, 17.4421f, 18.931f)
                horizontalLineTo(9.9624f)
                verticalLineTo(7.8339f)
                lineTo(11.7218f, 4.3859f)
                curveTo(11.9082f, 4.0368f, 12.2789f, 3.8263f, 12.6742f, 3.8449f)
                curveTo(13.1979f, 3.8453f, 13.6223f, 4.2702f, 13.622f, 4.794f)
                curveTo(13.6219f, 4.8468f, 13.6175f, 4.8996f, 13.6087f, 4.9517f)
                lineTo(12.9242f, 8.9686f)
                horizontalLineTo(18.4952f)
                curveTo(19.8707f, 8.9685f, 20.9859f, 10.0834f, 20.986f, 11.4589f)
                curveTo(20.9861f, 11.6325f, 20.9679f, 11.8055f, 20.932f, 11.9753f)
                close()
            }
        }
        .build()
        return _thumbsUp!!
    }

private var _thumbsUp: ImageVector? = null
