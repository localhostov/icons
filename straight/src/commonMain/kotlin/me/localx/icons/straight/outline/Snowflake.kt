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

public val Icons.Outline.Snowflake: ImageVector
    get() {
        if (_snowflake != null) {
            return _snowflake!!
        }
        _snowflake = Builder(name = "Snowflake", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.467f, 13.637f)
                lineToRelative(-4.455f, 1.189f)
                lineToRelative(-1.923f, -1.084f)
                lineTo(17.089f, 10.31f)
                lineToRelative(1.922f, -1.084f)
                lineToRelative(4.456f, 1.188f)
                lineTo(24.0f, 8.482f)
                lineTo(20.12f, 7.448f)
                lineToRelative(1.052f, -3.816f)
                lineToRelative(-1.964f, -0.524f)
                lineTo(18.0f, 7.49f)
                lineTo(16.174f, 8.52f)
                lineTo(13.018f, 6.728f)
                lineTo(13.018f, 4.651f)
                lineToRelative(3.264f, -3.21f)
                lineTo(14.843f, 0.025f)
                lineTo(12.0f, 2.821f)
                lineTo(9.157f, 0.025f)
                lineTo(7.718f, 1.441f)
                lineToRelative(3.264f, 3.21f)
                lineTo(10.982f, 6.728f)
                lineTo(7.826f, 8.52f)
                lineTo(6.0f, 7.49f)
                lineTo(4.792f, 3.108f)
                lineToRelative(-1.964f, 0.524f)
                lineTo(3.88f, 7.448f)
                lineTo(0.0f, 8.482f)
                lineToRelative(0.533f, 1.932f)
                lineTo(4.988f, 9.226f)
                lineTo(6.911f, 10.31f)
                verticalLineToRelative(3.432f)
                lineTo(4.988f, 14.826f)
                lineTo(0.533f, 13.637f)
                lineTo(0.0f, 15.569f)
                lineTo(3.88f, 16.6f)
                lineTo(2.828f, 20.42f)
                lineToRelative(1.964f, 0.524f)
                lineTo(6.0f, 16.561f)
                lineToRelative(2.0f, -1.126f)
                lineToRelative(2.983f, 1.693f)
                lineTo(10.983f, 19.4f)
                lineTo(7.718f, 22.61f)
                lineToRelative(1.439f, 1.415f)
                lineTo(12.0f, 21.23f)
                lineToRelative(2.843f, 2.795f)
                lineToRelative(1.439f, -1.415f)
                lineTo(13.018f, 19.4f)
                lineTo(13.018f, 17.128f)
                lineTo(16.0f, 15.435f)
                lineToRelative(2.0f, 1.126f)
                lineToRelative(1.209f, 4.383f)
                lineToRelative(1.964f, -0.524f)
                lineTo(20.12f, 16.6f)
                lineTo(24.0f, 15.569f)
                close()
                moveTo(15.053f, 13.662f)
                lineTo(12.0f, 15.4f)
                lineTo(8.947f, 13.662f)
                lineTo(8.947f, 10.2f)
                lineTo(12.0f, 8.461f)
                lineTo(15.053f, 10.2f)
                close()
            }
        }
        .build()
        return _snowflake!!
    }

private var _snowflake: ImageVector? = null
