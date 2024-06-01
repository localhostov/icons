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

public val Icons.Outline.Snowflake: ImageVector
    get() {
        if (_snowflake != null) {
            return _snowflake!!
        }
        _snowflake = Builder(name = "Snowflake", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.467f, 13.6371f)
                    lineTo(19.012f, 14.8261f)
                    lineTo(17.089f, 13.7421f)
                    verticalLineTo(10.3101f)
                    lineTo(19.011f, 9.2261f)
                    lineTo(23.467f, 10.4141f)
                    lineTo(24.0f, 8.4822f)
                    lineTo(20.12f, 7.4482f)
                    lineTo(21.172f, 3.6321f)
                    lineTo(19.208f, 3.1082f)
                    lineTo(18.0f, 7.4901f)
                    lineTo(16.174f, 8.5202f)
                    lineTo(13.018f, 6.7281f)
                    verticalLineTo(4.6512f)
                    lineTo(16.282f, 1.4411f)
                    lineTo(14.843f, 0.0251f)
                    lineTo(12.0f, 2.8212f)
                    lineTo(9.157f, 0.0251f)
                    lineTo(7.718f, 1.4411f)
                    lineTo(10.982f, 4.6512f)
                    verticalLineTo(6.7281f)
                    lineTo(7.826f, 8.5202f)
                    lineTo(6.0f, 7.4901f)
                    lineTo(4.792f, 3.1082f)
                    lineTo(2.828f, 3.6321f)
                    lineTo(3.88f, 7.4482f)
                    lineTo(0.0f, 8.4822f)
                    lineTo(0.533f, 10.4141f)
                    lineTo(4.988f, 9.2261f)
                    lineTo(6.911f, 10.3101f)
                    verticalLineTo(13.7421f)
                    lineTo(4.988f, 14.8261f)
                    lineTo(0.533f, 13.6371f)
                    lineTo(0.0f, 15.5691f)
                    lineTo(3.88f, 16.6001f)
                    lineTo(2.828f, 20.4201f)
                    lineTo(4.792f, 20.9441f)
                    lineTo(6.0f, 16.5611f)
                    lineTo(8.0f, 15.4351f)
                    lineTo(10.983f, 17.1281f)
                    verticalLineTo(19.4001f)
                    lineTo(7.718f, 22.6101f)
                    lineTo(9.157f, 24.0251f)
                    lineTo(12.0f, 21.2301f)
                    lineTo(14.843f, 24.0251f)
                    lineTo(16.282f, 22.6101f)
                    lineTo(13.018f, 19.4001f)
                    verticalLineTo(17.1281f)
                    lineTo(16.0f, 15.4351f)
                    lineTo(18.0f, 16.5611f)
                    lineTo(19.209f, 20.9441f)
                    lineTo(21.173f, 20.4201f)
                    lineTo(20.12f, 16.6001f)
                    lineTo(24.0f, 15.5691f)
                    lineTo(23.467f, 13.6371f)
                    close()
                    moveTo(15.053f, 13.6621f)
                    lineTo(12.0f, 15.4001f)
                    lineTo(8.947f, 13.6621f)
                    verticalLineTo(10.2001f)
                    lineTo(12.0f, 8.4612f)
                    lineTo(15.053f, 10.2001f)
                    verticalLineTo(13.6621f)
                    close()
                }
            }
        }
        .build()
        return _snowflake!!
    }

private var _snowflake: ImageVector? = null
