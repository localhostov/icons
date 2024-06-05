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

public val Icons.Filled.TransformationDesign: ImageVector
    get() {
        if (_transformationDesign != null) {
            return _transformationDesign!!
        }
        _transformationDesign = Builder(name = "TransformationDesign", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.79f, 24.0f)
                lineTo(7.0f, 24.0f)
                lineToRelative(0.027f, -2.231f)
                lineTo(12.21f, 0.0f)
                horizontalLineToRelative(11.79f)
                lineToRelative(-0.027f, 2.231f)
                lineToRelative(-5.183f, 21.769f)
                close()
                moveTo(5.0f, 22.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                lineTo(0.0f, 19.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(2.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                lineTo(5.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(2.0f, 7.0f)
                lineTo(0.0f, 7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(2.0f, 13.0f)
                lineTo(0.0f, 13.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(10.154f, 0.0f)
                horizontalLineToRelative(-3.154f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.678f)
                lineToRelative(0.476f, -2.0f)
                close()
            }
        }
        .build()
        return _transformationDesign!!
    }

private var _transformationDesign: ImageVector? = null
