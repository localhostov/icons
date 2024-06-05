package me.localx.icons.straight.filled

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

public val Icons.Filled.Skeleton: ImageVector
    get() {
        if (_skeleton != null) {
            return _skeleton!!
        }
        _skeleton = Builder(name = "Skeleton", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.729f, 17.467f)
                curveToRelative(-0.004f, -0.01f, -0.593f, -1.467f, -2.224f, -1.467f)
                curveToRelative(-1.128f, 0.0f, -2.265f, 0.708f, -2.468f, 2.009f)
                curveToRelative(-0.025f, 0.159f, -0.038f, 0.322f, -0.038f, 0.487f)
                verticalLineToRelative(1.504f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.504f)
                curveToRelative(0.0f, -0.166f, -0.013f, -0.329f, -0.038f, -0.487f)
                curveToRelative(-0.203f, -1.298f, -1.334f, -2.009f, -2.459f, -2.009f)
                curveToRelative(-1.571f, 0.0f, -2.228f, 1.456f, -2.233f, 1.467f)
                curveToRelative(-0.551f, 1.36f, -0.271f, 2.533f, 0.775f, 3.922f)
                lineToRelative(1.941f, 2.611f)
                horizontalLineToRelative(10.026f)
                lineToRelative(1.941f, -2.611f)
                curveToRelative(1.046f, -1.389f, 1.326f, -2.562f, 0.775f, -3.922f)
                close()
            }
        }
        .build()
        return _skeleton!!
    }

private var _skeleton: ImageVector? = null
